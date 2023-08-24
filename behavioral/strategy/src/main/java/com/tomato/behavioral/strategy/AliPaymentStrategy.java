package com.tomato.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 阿里支付
 *
 * @author lizhifu
 * @since 2023/8/24
 */
@Slf4j
public class AliPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        log.info("阿里支付:{}",amount);
    }
}
