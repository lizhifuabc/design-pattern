package com.tomato.creational.factory.method;

import lombok.extern.slf4j.Slf4j;

/**
 * h5 订单 具体产品类
 *
 * @author lizhifu
 * @since 2023/8/23
 */
@Slf4j
public class H5OrderService implements OrderService{
    @Override
    public OrderType orderType() {
        log.info("h5 订单");
        return OrderType.H5;
    }

    @Override
    public void createOrder() {
        log.info("h5 创建订单");
    }
}
