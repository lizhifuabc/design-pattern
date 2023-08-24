package com.tomato.behavioral.strategy;

/**
 * Payment
 *
 * @author lizhifu
 * @since 2023/8/24
 */
public class PaymentTest {
    public static void main(String[] args) {
        Payment payment = new Payment(new AliPaymentStrategy());
        payment.pay(100);
        payment.changeStrategy(new WxPaymentStrategy());
        payment.pay(100);
    }
}
