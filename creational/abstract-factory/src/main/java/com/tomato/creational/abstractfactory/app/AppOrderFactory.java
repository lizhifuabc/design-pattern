package com.tomato.creational.abstractfactory.app;

import com.tomato.creational.abstractfactory.CompleteOrder;
import com.tomato.creational.abstractfactory.CreateOrder;
import com.tomato.creational.abstractfactory.OrderFactory;
import com.tomato.creational.abstractfactory.app.AppCompleteOrder;
import com.tomato.creational.abstractfactory.app.AppCreateOrder;

/**
 * app 订单工厂
 *
 * @author lizhifu
 * @since 2023/8/22
 */
public class AppOrderFactory implements OrderFactory {
    @Override
    public CreateOrder createOrder() {
        return new AppCreateOrder();
    }

    @Override
    public CompleteOrder completeOrder() {
        return new AppCompleteOrder();
    }
}
