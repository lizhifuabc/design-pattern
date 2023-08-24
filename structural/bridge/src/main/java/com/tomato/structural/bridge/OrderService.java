package com.tomato.structural.bridge;

/**
 * 组件接口
 *
 * @author lizhifu
 * @since 2023/8/24
 */
public interface OrderService {
    /**
     * 创建订单
     */
    String createOrder();

    /**
     * 完成订单
     */
    String completeOrder();
}
