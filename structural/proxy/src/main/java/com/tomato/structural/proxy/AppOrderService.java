package com.tomato.structural.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * app订单
 *
 * @author lizhifu
 * @since 2023/8/24
 */
@Slf4j
public class AppOrderService implements OrderService{
    @Override
    public void createOrder() {
        log.info("app订单创建");
    }
}
