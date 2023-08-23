package com.tomato.creational.stepbuilder;

/**
 * 订单信息按步builder
 *
 * @author lizhifu
 * @since 2023/8/23
 */
public final class OrderInfoStepBuilder {
    /**
     * 私有化构造函数
     */
    private OrderInfoStepBuilder() {
    }
    /**
     * newBuilder
     * @return OrderNoStep
     */
    public static OrderNoStep newBuilder() {
        return new OrderInfoSteps();
    }

    /**
     * 负责构建角色对象的最后一步
     * 验证应该在这里
     */
    public interface BuildStep {
        /**
         * 构建
         * @return OrderInfo
         */
        OrderInfo build();
    }

    /**
     * 第一步，第二步 OrderTypeStep
     */
    public interface OrderNoStep {
        OrderTypeStep orderNo(String orderNo);
    }
    /**
     * 第二步，第三步 OrderStatusStep
     */
    public interface OrderTypeStep {
        OrderStatusStep orderType(String orderType);
    }
    /**
     * 第三步，第四步 BuildStep
     */
    public interface OrderStatusStep {
        BuildStep orderStatus(String orderStatus);
    }
    /**
     * 步骤生成器实现
     */
    private static class OrderInfoSteps implements BuildStep, OrderNoStep, OrderTypeStep, OrderStatusStep {
        private String orderNo;
        private String orderType;
        private String orderStatus;

        @Override
        public OrderInfo build() {
            OrderInfo orderInfo = new OrderInfo();
            orderInfo.setOrderNo(orderNo);
            orderInfo.setOrderType(orderType);
            orderInfo.setOrderStatus(orderStatus);
            return orderInfo;
        }

        @Override
        public OrderTypeStep orderNo(String orderNo) {
            this.orderNo = orderNo;
            return this;
        }

        @Override
        public OrderStatusStep orderType(String orderType) {
            this.orderType = orderType;
            return this;
        }

        @Override
        public BuildStep orderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
            return this;
        }
    }
}
