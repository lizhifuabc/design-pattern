package com.tomato.behavioral.state;

/**
 * 订单状态：状态接口
 *
 * @author lizhifu
 * @since 2023/8/23
 */
public interface OrderState {
    /**
     * 初始化
     */
    void init();
    /**
     * 处理中
     */
    void deal();
    /**
     * 成功
     */
    void success();
    /**
     * 退款
     */
    void refund();
    /**
     * 超时
     */
    void timeout();
}
