package com.tomato.behavioral.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 成功
 *
 * @author lizhifu
 * @since 2023/8/23
 */
@Slf4j
public class SuccessOrderState extends AbstractOrderState{
    @Override
    public void init() {
        throw new RuntimeException("订单已成功，不能初始化");
    }

    @Override
    public void deal() {
        throw new RuntimeException("订单已成功，不能处理");
    }

    @Override
    public void success() {
        log.info("订单成功");
    }

    @Override
    public void refund() {
        log.info("订单退款");
    }

    @Override
    public void timeout() {
        throw new RuntimeException("订单已成功，不能超时");
    }
}
