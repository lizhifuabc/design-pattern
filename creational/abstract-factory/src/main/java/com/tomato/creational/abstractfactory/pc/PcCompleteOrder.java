package com.tomato.creational.abstractfactory.pc;

import com.tomato.creational.abstractfactory.CompleteOrder;

/**
 * PC 完成订单
 *
 * @author lizhifu
 * @since 2023/8/22
 */
public class PcCompleteOrder implements CompleteOrder {
    @Override
    public String completeOrder() {
        return "PC 完成订单";
    }
}
