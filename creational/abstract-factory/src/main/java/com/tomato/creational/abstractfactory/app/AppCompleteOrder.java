package com.tomato.creational.abstractfactory.app;

import com.tomato.creational.abstractfactory.CompleteOrder;

/**
 * app完成订单成功
 *
 * @author lizhifu
 * @since 2023/8/22
 */
public class AppCompleteOrder implements CompleteOrder {
    @Override
    public String completeOrder() {
        return "app完成订单成功";
    }
}
