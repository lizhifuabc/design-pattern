package com.tomato.creational.abstractfactory;

import com.tomato.creational.abstractfactory.base.BeanFactory;

/**
 * 订单工厂 抽象工厂接口
 * 定义了创建订单和完成订单的方法。
 *
 * @author lizhifu
 * @since 2023/8/22
 */
public interface OrderFactory extends BeanFactory {
    /**
     * 创建订单
     * @return 创建订单
     */
    CreateOrder createOrder();

    /**
     * 完成订单
     * @return 完成订单
     */
    CompleteOrder completeOrder();
}
