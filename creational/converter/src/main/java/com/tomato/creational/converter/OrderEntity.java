package com.tomato.creational.converter;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * 订单实体
 *
 * @author lizhifu
 * @since 2023/8/24
 */
@RequiredArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class OrderEntity {
    private final String orderNo;
}
