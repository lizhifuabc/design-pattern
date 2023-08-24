package com.tomato.structural.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 订单接口,代理
 *
 * @author lizhifu
 * @since 2023/8/24
 */
@Slf4j
public class ProxyOrderService implements OrderService{
    private final AppOrderService appOrderService;
    public ProxyOrderService(AppOrderService appOrderService) {
        this.appOrderService = appOrderService;
    }
    @Override
    public void createOrder() {
        log.info("代理前");
        appOrderService.createOrder();
        log.info("代理后");
    }
}
