package com.tomato.async.method.invocation;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 异步执行器,启动异步任务（创建 thread），返回异步结果
 *
 * @author lizhifu
 * @since 2023/8/28
 */
public class ThreadAsyncExecutor implements AsyncExecutor{
    /**
     * 线程索引
     */
    private final AtomicInteger idx = new AtomicInteger(0);
    @Override
    public <T> AsyncResult<T> startProcess(Callable<T> task) {
        return startProcess(task, null);
    }

    @Override
    public <T> AsyncResult<T> startProcess(Callable<T> task, AsyncCallback<T> callback) {
        DefaultAsyncResult<T> result = new DefaultAsyncResult<>(callback);
        new Thread(() -> {
            try {
                result.setValue(task.call());
            } catch (Exception e) {
                result.setException(e);
            }
        },"executor-" + idx.incrementAndGet()).start();
        return result;
    }

    @Override
    public <T> T endProcess(AsyncResult<T> asyncResult) throws Exception {
        // 任务未执行完成，阻塞当前线程
        if (!asyncResult.isCompleted()) {
            asyncResult.await();
        }
        // 任务执行完成，返回结果
        return asyncResult.getValue();
    }
}
