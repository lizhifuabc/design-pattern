package com.tomato.creational.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * h5 订单
 *
 * @author lizhifu
 * @since 2023/8/23
 */
@Slf4j
public class H5OrderService implements OrderService{
    @Override
    public void createOrder() {
        log.info("h5 订单");
    }
}
