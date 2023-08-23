package com.tomato.creational.factory.method;

import lombok.RequiredArgsConstructor;

/**
 * 订单类型
 *
 * @author lizhifu
 * @since 2023/8/23
 */
@RequiredArgsConstructor
public enum OrderType {
    /**
     * APP 订单
     */
    APP("APP"),
    /**
     * H5 订单
     */
    H5("H5");
    private final String value;
}
