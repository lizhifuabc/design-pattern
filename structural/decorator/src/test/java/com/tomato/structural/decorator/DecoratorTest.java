package com.tomato.structural.decorator;

/**
 * Decorator
 *
 * @author lizhifu
 * @since 2023/8/24
 */
public class DecoratorTest {
    public static void main(String[] args) {
        OrderService orderService = new AppOrderServiceDecorator(new AppOrderService());
        System.out.println(orderService.createOrder());
        System.out.println(orderService.completeOrder());
    }
}
