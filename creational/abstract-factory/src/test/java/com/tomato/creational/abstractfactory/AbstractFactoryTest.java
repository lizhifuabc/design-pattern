package com.tomato.creational.abstractfactory;

import org.junit.jupiter.api.Test;

/**
 * 抽象工厂测试
 *
 * @author lizhifu
 * @since 2023/8/22
 */
public class AbstractFactoryTest {
    private final OrderHelper orderHelper = new OrderHelper();
    @Test
    public void test(){
        OrderFactory orderFactory =
                OrderHelper.FactoryMaker.makeFactory(OrderHelper.FactoryMaker.OrderType.H5);
        orderHelper.setCreateOrder(orderFactory.createOrder());
        orderHelper.setCompleteOrder(orderFactory.completeOrder());

        System.out.println(orderHelper.getCreateOrder().createOrder());
        System.out.println(orderHelper.getCompleteOrder().completeOrder());
    }
}
