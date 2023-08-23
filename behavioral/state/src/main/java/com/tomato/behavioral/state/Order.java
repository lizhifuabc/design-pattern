package com.tomato.behavioral.state;

import lombok.Setter;

/**
 * 订单类
 *
 * @author lizhifu
 * @since 2023/8/23
 */
@Setter
public class Order {
    private OrderState state;
    public Order() {
        this.state = new InitOrderState();
    }
    public void init() {
        state.init();
    }
    public void deal() {
        state.deal();
    }
    public void success() {
        state.success();
    }
    public void refund() {
        state.refund();
    }
    public void timeout() {
        state.timeout();
    }
}
