package com.tomato.behavioral.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 退款
 *
 * @author lizhifu
 * @since 2023/8/23
 */
@Slf4j
public class RefundOrderState extends AbstractOrderState{
    @Override
    public void init() {
       throw new RuntimeException("订单已经初始化");
    }

    @Override
    public void deal() {
        throw new RuntimeException("订单处理中");
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
        throw new RuntimeException("订单超时");
    }
}
