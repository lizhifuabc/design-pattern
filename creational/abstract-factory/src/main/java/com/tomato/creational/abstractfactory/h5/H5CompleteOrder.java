package com.tomato.creational.abstractfactory.h5;

import com.tomato.creational.abstractfactory.CompleteOrder;

/**
 * H5CompleteOrder：具体产品类
 *
 * @author lizhifu
 * @since 2023/8/22
 */
public class H5CompleteOrder implements CompleteOrder {
    @Override
    public String completeOrder() {
        return "H5 完成订单";
    }
}
