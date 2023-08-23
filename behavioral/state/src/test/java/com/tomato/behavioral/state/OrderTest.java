package com.tomato.behavioral.state;

/**
 * Order
 *
 * @author lizhifu
 * @since 2023/8/23
 */
public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();
        order.init();
        order.deal();
        order.success();
        order.refund();
        order.timeout();
    }
}
