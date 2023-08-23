package com.tomato.creational.abstractfactory.app;

import com.tomato.creational.abstractfactory.CreateOrder;

/**
 * app 创建订单
 *
 * @author lizhifu
 * @since 2023/8/22
 */
public class AppCreateOrder implements CreateOrder {
    @Override
    public String createOrder() {
        return "APP创建订单成功";
    }
}
