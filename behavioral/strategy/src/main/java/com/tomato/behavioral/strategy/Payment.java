package com.tomato.behavioral.strategy;

/**
 * 支付
 *
 * @author lizhifu
 * @since 2023/8/24
 */
public class Payment {
    private PaymentStrategy paymentStrategy;
    public Payment(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void changeStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public void pay(int amount) {
        paymentStrategy.pay(amount);
    }
}
