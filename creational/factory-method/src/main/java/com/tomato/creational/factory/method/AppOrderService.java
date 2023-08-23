package com.tomato.creational.factory.method;

import lombok.extern.slf4j.Slf4j;

/**
 * app 订单 具体产品类
 *
 * @author lizhifu
 * @since 2023/8/23
 */
@Slf4j
public class AppOrderService implements OrderService{
    @Override
    public OrderType orderType() {
        log.info("app 订单");
        return OrderType.APP;
    }

    @Override
    public void createOrder() {
        log.info("app 创建订单");
    }
}
