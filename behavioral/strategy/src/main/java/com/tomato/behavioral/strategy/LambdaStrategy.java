package com.tomato.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 策略接口
 *
 * @author lizhifu
 * @since 2023/8/24
 */
@Slf4j
public class LambdaStrategy {
    /**
     * 枚举来演示策略模式
     */
    public enum Strategy implements PaymentStrategy {
        /**
         * 微信支付
         */
        WX((int amount) -> log.info("微信支付")),
        /**
         * 阿里支付
         */
        ALI((int amount) -> log.info("阿里支付"))
        ;
        /**
         * 策略接口
         */
        private final PaymentStrategy paymentStrategy;

        Strategy(PaymentStrategy paymentStrategy) {
            this.paymentStrategy = paymentStrategy;
        }

        @Override
        public void pay(int amount) {
            paymentStrategy.pay(amount);
        }
    }
}
