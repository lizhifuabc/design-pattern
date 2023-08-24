package com.tomato.creational.converter;

/**
 * ConverterTest
 *
 * @author lizhifu
 * @since 2023/8/24
 */
public class ConverterTest {
    private final static OrderConverter orderConverter = new OrderConverter();
    public static void main(String[] args) {
        OrderDto orderDto = new OrderDto("123");
        OrderEntity orderEntity = orderConverter.convertFromDto(orderDto);
        System.out.println(orderEntity);
        System.out.println(orderConverter.convertFromEntity(orderEntity));
    }
}
