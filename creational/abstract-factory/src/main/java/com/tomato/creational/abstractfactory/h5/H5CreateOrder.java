package com.tomato.creational.abstractfactory.h5;

import com.tomato.creational.abstractfactory.CreateOrder;

/**
 * H5CreateOrder：是具体产品类
 *
 * @author lizhifu
 * @since 2023/8/22
 */
public class H5CreateOrder implements CreateOrder {
    @Override
    public String createOrder() {
        return "H5创建订单成功";
    }
}
