package com.tomato.creational.factory;

/**
 * 订单工厂
 *
 * @author lizhifu
 * @since 2023/8/23
 */
public class OrderFactory {
    /**
     * 获取订单
     * @param type 订单类型
     * @return OrderService 订单
     */
    public static OrderService getOrderService(OrderType type) {
        return type.getConstructor().get();
    }
}