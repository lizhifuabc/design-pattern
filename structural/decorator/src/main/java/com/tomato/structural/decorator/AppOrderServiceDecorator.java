package com.tomato.structural.decorator;

/**
 * APP 订单
 *
 * @author lizhifu
 * @since 2023/8/24
 */
public class AppOrderServiceDecorator implements OrderServiceDecorator{
    private final OrderService orderService;

    public AppOrderServiceDecorator(OrderService orderService) {
        this.orderService = orderService;
    }

    @Override
    public String createOrder() {
        return orderService.createOrder() + "Decorator";
    }

    @Override
    public String completeOrder() {
        return orderService.completeOrder() + "Decorator";
    }
}
