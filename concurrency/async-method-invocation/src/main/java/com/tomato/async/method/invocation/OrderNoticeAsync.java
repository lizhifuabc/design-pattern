package com.tomato.async.method.invocation;

/**
 * 订单通知
 *
 * @author lizhifu
 * @since 2023/8/28
 */
public class OrderNoticeAsync {
    public static void main(String[] args) {
        ThreadAsyncExecutor executor = new ThreadAsyncExecutor();
        AsyncResult<OrderNotice> orderResult = executor.startProcess(OrderNoticeAsync::noticeOrder);
        System.out.println("订单通知已经发送");
        boolean completed = orderResult.isCompleted();
        System.out.println("订单通知是否完成：" + completed);
    }

    public static OrderNotice noticeOrder() {
        System.out.println("开始通知订单");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("通知订单完成");
        return new OrderNotice();
    }
}
