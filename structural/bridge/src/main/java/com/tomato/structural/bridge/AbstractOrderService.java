package com.tomato.structural.bridge;

/**
 * 抽象主题
 *
 * @author lizhifu
 * @since 2023/8/24
 */
public abstract class AbstractOrderService {
    protected final OrderService orderService;

    protected AbstractOrderService(OrderService orderService) {
        this.orderService = orderService;
    }
    public abstract void order();
}
