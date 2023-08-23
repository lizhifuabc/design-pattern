package com.tomato.creational.factory;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

/**
 * 订单类型
 *
 * @author lizhifu
 * @since 2023/8/23
 */
@RequiredArgsConstructor
@Getter
public enum OrderType {
    /**
     * APP 订单
     */
    APP(AppOrderService::new),
    /**
     * H5 订单
     */
    H5(H5OrderService::new);
    /**
     * 构造函数
     */
    private final Supplier<OrderService> constructor;
}
