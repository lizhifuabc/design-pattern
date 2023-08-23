package com.tomato.behavioral.state;

import lombok.extern.slf4j.Slf4j;

/**
 * 超时
 *
 * @author lizhifu
 * @since 2023/8/23
 */
@Slf4j
public class TimeoutOrderState extends AbstractOrderState{
    @Override
    public void init() {
        throw new RuntimeException("订单已超时，不能初始化");
    }

    @Override
    public void deal() {
        throw new RuntimeException("订单已超时，不能处理");
    }

    @Override
    public void success() {
        // 需要进一步处理，比如退款
        log.error("订单已超时，不能成功");
        throw new RuntimeException("订单已超时，不能成功");
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
