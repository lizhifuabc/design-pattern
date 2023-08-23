package com.tomato.creational.abstractfactory.pc;

import com.tomato.creational.abstractfactory.CreateOrder;

/**
 * PC创建订单
 *
 * @author lizhifu
 * @since 2023/8/22
 */
public class PcCreateOrder implements CreateOrder {
    @Override
    public String createOrder() {
        return "PC创建订单成功";
    }
}
