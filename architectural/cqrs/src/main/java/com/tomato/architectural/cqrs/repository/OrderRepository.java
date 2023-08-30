package com.tomato.architectural.cqrs.repository;

import com.tomato.architectural.cqrs.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 订单仓储服务
 *
 * @author lizhifu
 * @since 2023/8/30
 */
public interface OrderRepository extends JpaRepository<Order, Long> {

    Order findByOrderNo(String orderNo);
}
