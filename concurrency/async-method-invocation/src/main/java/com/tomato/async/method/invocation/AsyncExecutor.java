package com.tomato.async.method.invocation;

import java.util.concurrent.Callable;

/**
 * 异步执行器
 *
 * @author lizhifu
 * @since 2023/8/28
 */
public interface AsyncExecutor {
    /**
     * 开始执行任务
     * @param task 任务
     * @param <T> 任务类型
     * @return 异步执行结果
     */
    <T> AsyncResult<T> startProcess(Callable<T> task);
    /**
     * 开始执行任务
     * @param task 任务
     * @param callback 回调
     * @param <T> 任务类型
     * @return 异步执行结果
     */
    <T> AsyncResult<T> startProcess(Callable<T> task, AsyncCallback<T> callback);
    /**
     * 结束执行任务
     * @param asyncResult 异步执行结果
     * @param <T> 任务类型
     * @return 执行结果
     * @throws Exception 异常
     */
    <T> T endProcess(AsyncResult<T> asyncResult) throws Exception;
}
