package com.tomato.creational.converter;

/**
 * 订单转换器
 *
 * @author lizhifu
 * @since 2023/8/24
 */
public class OrderConverter extends Converter<OrderDto, OrderEntity>{
    public OrderConverter() {
        super(OrderConverter::convertToEntity, OrderConverter::convertToDto);
    }

    private static OrderDto convertToDto(OrderEntity orderEntity) {
        return new OrderDto(orderEntity.getOrderNo());
    }

    private static OrderEntity convertToEntity(OrderDto dto) {
        return new OrderEntity(dto.getOrderNo());
    }
}
