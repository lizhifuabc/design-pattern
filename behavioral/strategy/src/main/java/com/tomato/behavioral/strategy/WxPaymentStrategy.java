package com.tomato.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 微信支付
 *
 * @author lizhifu
 * @since 2023/8/24
 */
@Slf4j
public class WxPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        log.info("微信支付:{}",amount);
    }
}
