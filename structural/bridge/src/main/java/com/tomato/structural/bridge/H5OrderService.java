package com.tomato.structural.bridge;

/**
 * H5 订单
 *
 * @author lizhifu
 * @since 2023/8/24
 */
public class H5OrderService implements OrderService{
    @Override
    public String createOrder() {
        return "H5 创建订单";
    }

    @Override
    public String completeOrder() {
        return "H5 完成订单";
    }
}
