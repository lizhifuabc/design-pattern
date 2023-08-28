package com.tomato.concurrency.versionnumber;

import lombok.Getter;
import lombok.Setter;

/**
 * 订单
 *
 * @author lizhifu
 * @since 2023/8/28
 */
@Getter
@Setter
public class Order {
    /**
     * 版本号
     */
    private Integer version;
    /**
     * 订单号
     */
    private String orderNo;
}
