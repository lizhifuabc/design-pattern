package com.tomato.behavioral.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 初始化
 *
 * @author lizhifu
 * @since 2023/8/23
 */
@Slf4j
public class InitOrderState extends AbstractOrderState{
    @Override
    public void init() {
        log.info("订单初始化");
    }

    @Override
    public void deal() {
        log.info("订单处理中");
    }

    @Override
    public void success() {
        log.info("订单成功");
    }

    @Override
    public void refund() {
        throw new RuntimeException("订单未支付，不能退款");
    }

    @Override
    public void timeout() {
        log.info("订单超时");
    }
}
