package com.tomato.behavioral.strategy;

/**
 * LambdaStrategy
 *
 * @author lizhifu
 * @since 2023/8/24
 */
public class LambdaStrategyTest {
    public static void main(String[] args) {
        LambdaStrategy.Strategy.WX.pay(100);
        LambdaStrategy.Strategy.ALI.pay(100);
    }
}
