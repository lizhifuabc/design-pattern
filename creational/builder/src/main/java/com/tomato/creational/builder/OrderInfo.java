package com.tomato.creational.builder;

/**
 * 订单信息
 *
 * @author lizhifu
 * @since 2023/8/23
 */
public record OrderInfo(OrderType orderType, String orderNo) {
    private OrderInfo(Builder builder) {
        this(builder.orderType, builder.orderNo);
    }
    /**
     * 订单 Builder
     */
    public static class Builder {
        /**
         * 订单类型
         */
        private OrderType orderType;
        /**
         * 订单编号
         */
        private String orderNo;
        public Builder withOrderType(OrderType orderType) {
            this.orderType = orderType;
            return this;
        }
        public Builder withOrderNo(String orderNo) {
            this.orderNo = orderNo;
            return this;
        }

        public OrderInfo build() {
            return new OrderInfo(this);
        }
    }
}
