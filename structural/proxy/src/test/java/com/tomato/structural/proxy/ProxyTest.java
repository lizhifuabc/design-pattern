package com.tomato.structural.proxy;

/**
 * Proxy
 *
 * @author lizhifu
 * @since 2023/8/24
 */
public class ProxyTest {
    public static void main(String[] args) {
        AppOrderService appOrderService = new AppOrderService();
        ProxyOrderService proxyOrderService = new ProxyOrderService(appOrderService);
        proxyOrderService.createOrder();
    }
}
