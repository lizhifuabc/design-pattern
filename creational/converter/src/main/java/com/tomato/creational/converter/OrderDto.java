package com.tomato.creational.converter;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * 订单DTO
 *
 * @author lizhifu
 * @since 2023/8/24
 */
@ToString
@EqualsAndHashCode
@Getter
@RequiredArgsConstructor
public class OrderDto {
    private final String orderNo;
}
