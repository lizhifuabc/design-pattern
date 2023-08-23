package com.tomato.creational.factory.method;

/**
 * 测试
 *
 * @author lizhifu
 * @since 2023/8/23
 */
public class FactoryMethodTest {
    public static void main(String[] args) {
        OrderServiceFactory orderServiceFactory = new AppOrderServiceFactory();
        orderServiceFactory.create().orderType();
        orderServiceFactory.create().createOrder();
    }
}
