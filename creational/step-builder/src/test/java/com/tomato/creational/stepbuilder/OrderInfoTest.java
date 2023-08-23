package com.tomato.creational.stepbuilder;

/**
 * OrderInfo
 *
 * @author lizhifu
 * @since 2023/8/23
 */
public class OrderInfoTest {
    public static void main(String[] args) {
        OrderInfo orderInfo = OrderInfoStepBuilder.newBuilder()
                .orderNo("123")
                .orderType("1")
                .orderStatus("1")
                .build();
        System.out.println(orderInfo);
    }
}
