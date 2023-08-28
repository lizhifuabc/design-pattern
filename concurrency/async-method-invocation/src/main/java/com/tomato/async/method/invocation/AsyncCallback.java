package com.tomato.async.method.invocation;

import java.util.Optional;

/**
 * 异步执行回调接口
 *
 * @author lizhifu
 * @since 2023/8/28
 */
public interface AsyncCallback<T> {
    /**
     * 执行成功
     * @param value 执行结果
     * @param ex 异常
     */
    void onComplete(T value, Optional<Exception> ex);
}
