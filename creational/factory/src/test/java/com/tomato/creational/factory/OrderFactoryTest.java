package com.tomato.creational.factory;

/**
 * OrderFactory Test
 *
 * @author lizhifu
 * @since 2023/8/23
 */
public class OrderFactoryTest {
    public static void main(String[] args) {
        OrderService orderService = OrderFactory.getOrderService(OrderType.APP);
        orderService.createOrder();
    }
}
