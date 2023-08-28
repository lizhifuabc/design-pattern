package com.tomato.async.method.invocation;

import java.util.Optional;
import java.util.concurrent.ExecutionException;

/**
 * 默认异步执行结果封装
 *
 * @author lizhifu
 * @since 2023/8/28
 */
public class DefaultAsyncResult<T> implements AsyncResult<T>{
    // ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓ 任务执行状态 ↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    volatile int state = RUNNING;
    static final int RUNNING = 1;
    static final int FAILED = 2;
    static final int SUCCESS = 3;
    // ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ 任务执行状态 ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑
    /**
     * 锁
     */
    final Object lock;
    /**
     * 回调
     */
    final Optional<AsyncCallback<T>> callback;
    /**
     * 结果
     */
    T value;
    /**
     * 异常
     */
    Exception exception;

    public DefaultAsyncResult(AsyncCallback<T> callback) {
        this.lock = new Object();
        // 回调
        this.callback = Optional.ofNullable(callback);
    }

    @Override
    public boolean isCompleted() {
        // 任务执行状态 > RUNNING,说明任务已经执行完成
        return state > RUNNING;
    }

    @Override
    public T getValue() throws ExecutionException {
        // 任务执行成功，返回结果
        if (state == SUCCESS) {
            return value;
        // 任务执行失败，抛出异常
        } else if (state == FAILED) {
            throw new ExecutionException(exception);
        } else {
            throw new IllegalStateException("执行尚未完成");
        }
    }

    @Override
    public void await() throws InterruptedException {
        synchronized (lock) {
            // 任务未执行完成，等待
            while (!isCompleted()) {
                lock.wait();
            }
        }
    }

    /**
     * 设置任务执行结果
     * @param value 结果
     */
    void setValue(T value) {
        this.value = value;
        // 任务执行成功
        this.state = SUCCESS;
        // 回调,执行回调
        this.callback.ifPresent(ac -> ac.onComplete(value, Optional.empty()));
        // 通知等待的线程
        synchronized (lock) {
            lock.notifyAll();
        }
    }

    /**
     * 设置任务执行异常
     * @param exception 异常
     */
    void setException(Exception exception) {
        this.exception = exception;
        // 任务执行失败
        this.state = FAILED;
        // 回调,执行回调
        this.callback.ifPresent(ac -> ac.onComplete(null, Optional.of(exception)));
        // 通知等待的线程
        synchronized (lock) {
            lock.notifyAll();
        }
    }
}
