package com.tomato.behavioral.strategy;

/**
 * 策略接口
 *
 * @author lizhifu
 * @since 2023/8/24
 */
@FunctionalInterface
public interface PaymentStrategy {
    void pay(int amount);
}
