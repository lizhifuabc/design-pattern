package com.tomato.async.method.invocation;

import java.util.concurrent.ExecutionException;

/**
 * 异步执行结果
 *
 * @author lizhifu
 * @since 2023/8/28
 */
public interface AsyncResult<T> {
    /**
     * 任务是否执行完成
     * @return 是否完成，结果可能是成功或者失败
     */
    boolean isCompleted();
    /**
     * 获取执行结果
     * @return 执行结果
     * @throws ExecutionException 执行异常
     */
    T getValue() throws ExecutionException;
    /**
     * 阻塞当前线程，直到任务执行完成
     * @throws InterruptedException 中断异常
     */
    void await() throws InterruptedException;
}
