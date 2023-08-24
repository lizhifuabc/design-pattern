package com.tomato.structural.bridge;

import lombok.extern.slf4j.Slf4j;

/**
 * 扩展抽象主题
 *
 * @author lizhifu
 * @since 2023/8/24
 */
@Slf4j
public class ExtentAbstractOrderService extends AbstractOrderService{
    protected ExtentAbstractOrderService(OrderService orderService) {
        super(orderService);
    }

    @Override
    public void order() {
        log.info("扩展抽象主题");
        orderService.createOrder();
        orderService.completeOrder();
    }
}
