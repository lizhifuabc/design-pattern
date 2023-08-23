package com.tomato.creational.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * app 订单
 *
 * @author lizhifu
 * @since 2023/8/23
 */
@Slf4j
public class AppOrderService implements OrderService{
    @Override
    public void createOrder() {
        log.info("app 订单");
    }
}
