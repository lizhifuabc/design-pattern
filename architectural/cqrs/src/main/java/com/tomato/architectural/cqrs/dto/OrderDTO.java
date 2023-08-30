package com.tomato.architectural.cqrs.dto;

import lombok.*;

/**
 * 订单 DTO
 *
 * @author lizhifu
 * @since 2023/8/30
 */
@ToString
@EqualsAndHashCode
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {

    private String orderNo;

    private String orderStatus;
}
