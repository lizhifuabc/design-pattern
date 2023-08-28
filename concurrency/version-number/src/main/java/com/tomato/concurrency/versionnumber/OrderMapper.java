package com.tomato.concurrency.versionnumber;

/**
 * 订单mapper
 *
 * @author lizhifu
 * @since 2023/8/28
 */
public class OrderMapper {
    /**
     * 模拟数据库
     */
    private static final Order order;
    static {
        order = new Order();
        order.setOrderNo("123456");
        order.setVersion(1);
    }
    public void update(Order updateOrder) {
        // update order set version = version + 1 where order_no = #{orderNo} and version = #{version}
        // if update count == 0 throw new RuntimeException 版本号不一致
        if (order.getVersion().equals(updateOrder.getVersion())) {
            order.setVersion(order.getVersion() + 1);
        } else {
            throw new RuntimeException("版本号不一致");
        }
    }
}
