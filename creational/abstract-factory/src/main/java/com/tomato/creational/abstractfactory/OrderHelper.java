package com.tomato.creational.abstractfactory;

import com.tomato.creational.abstractfactory.app.AppOrderFactory;
import com.tomato.creational.abstractfactory.h5.H5OrderFactory;
import com.tomato.creational.abstractfactory.pc.PcOrderFactory;
import lombok.Getter;
import lombok.Setter;

/**
 * 订单
 *
 * @author lizhifu
 * @since 2023/8/22
 */
@Getter
@Setter
public class OrderHelper {
    /**
     * 创建订单
     */
    private CreateOrder createOrder;
    /**
     * 完成订单
     */
    private CompleteOrder completeOrder;
    /**
     * 订单类型工厂实例创建
     */
    public static class FactoryMaker {
        /**
         * 订单类型
         */
        public enum OrderType {
            H5, APP, PC
        }

        /**
         * 订单工厂
         * @param type 订单类型
         * @return 订单工厂
         */
        public static OrderFactory makeFactory(OrderType type) {
            return switch (type) {
                case H5 -> new H5OrderFactory();
                case APP -> new AppOrderFactory();
                case PC -> new PcOrderFactory();
            };
        }
    }
}
