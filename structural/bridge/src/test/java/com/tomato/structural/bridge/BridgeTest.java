package com.tomato.structural.bridge;

/**
 * bridge
 *
 * @author lizhifu
 * @since 2023/8/24
 */
public class BridgeTest {
    public static void main(String[] args) {
        AbstractOrderService abstractOrderService =
                new ExtentAbstractOrderService(new H5OrderService());
        abstractOrderService.order();
    }
}
