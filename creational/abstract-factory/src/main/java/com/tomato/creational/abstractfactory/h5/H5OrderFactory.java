package com.tomato.creational.abstractfactory.h5;

import com.tomato.creational.abstractfactory.CompleteOrder;
import com.tomato.creational.abstractfactory.CreateOrder;
import com.tomato.creational.abstractfactory.OrderFactory;
import com.tomato.creational.abstractfactory.h5.H5CompleteOrder;
import com.tomato.creational.abstractfactory.h5.H5CreateOrder;

/**
 * H5 订单工厂
 * 具体工厂类，负责创建 H5 版本的订单相关产品
 *
 * @author lizhifu
 * @since 2023/8/22
 */
public class H5OrderFactory implements OrderFactory {
    @Override
    public CreateOrder createOrder() {
        return new H5CreateOrder();
    }

    @Override
    public CompleteOrder completeOrder() {
        return new H5CompleteOrder();
    }
}
