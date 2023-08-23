package com.tomato.creational.factory.method;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/**
 * H5 订单服务
 *
 * @author lizhifu
 * @since 2023/8/23
 */
public class H5OrderServiceFactory implements OrderServiceFactory {
    private static final Map<OrderType, H5OrderService> H5;
    static {
        H5 = new EnumMap<>(OrderType.class);
        Arrays.stream(OrderType.values()).forEach(type -> H5.put(type, new H5OrderService()));
    }
    @Override
    public OrderService create() {
        return new H5OrderService();
    }
}
