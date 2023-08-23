package com.tomato.creational.factory.method;

/**
 * 订单接口,抽象产品接口
 *
 * @author lizhifu
 * @since 2023/8/23
 */
public interface OrderService {
    /**
     * 订单类型
     */
    OrderType orderType();
    /**
     * 创建订单
     */
    void createOrder();
}
