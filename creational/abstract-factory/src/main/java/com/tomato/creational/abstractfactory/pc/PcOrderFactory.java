package com.tomato.creational.abstractfactory.pc;

import com.tomato.creational.abstractfactory.CompleteOrder;
import com.tomato.creational.abstractfactory.CreateOrder;
import com.tomato.creational.abstractfactory.OrderFactory;
import com.tomato.creational.abstractfactory.pc.PcCompleteOrder;
import com.tomato.creational.abstractfactory.pc.PcCreateOrder;

/**
 * pc 订单工厂
 *
 * @author lizhifu
 * @since 2023/8/22
 */
public class PcOrderFactory implements OrderFactory {
    @Override
    public CreateOrder createOrder() {
        return new PcCreateOrder();
    }

    @Override
    public CompleteOrder completeOrder() {
        return new PcCompleteOrder();
    }
}
