package com.tomato.creational.stepbuilder;

import lombok.Getter;
import lombok.Setter;

/**
 * 订单信息
 *
 * @author lizhifu
 * @since 2023/8/23
 */
@Getter
@Setter
public class OrderInfo {
    private String orderNo;
    private String orderType;
    private String orderStatus;
}
