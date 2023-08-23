package com.tomato.creational.factory.method;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/**
 * APP 订单服务
 *
 * @author lizhifu
 * @since 2023/8/23
 */
public class AppOrderServiceFactory implements OrderServiceFactory {
    private static final Map<OrderType, AppOrderService> APP;
    static {
        APP = new EnumMap<>(OrderType.class);
        Arrays.stream(OrderType.values()).forEach(type -> APP.put(type, new AppOrderService()));
    }
    @Override
    public OrderService create() {
        return new AppOrderService();
    }
}
