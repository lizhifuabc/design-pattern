package com.tomato.structural.bridge;

/**
 * APP 订单
 *
 * @author lizhifu
 * @since 2023/8/24
 */
public class AppOrderService implements OrderService{
    @Override
    public String createOrder() {
        return "app 创建订单";
    }

    @Override
    public String completeOrder() {
        return "app 完成订单";
    }
}
