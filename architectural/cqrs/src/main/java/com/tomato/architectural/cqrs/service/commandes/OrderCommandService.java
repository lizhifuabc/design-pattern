package com.tomato.architectural.cqrs.service.commandes;

import com.tomato.architectural.cqrs.domain.Order;
import com.tomato.architectural.cqrs.repository.OrderRepository;

/**
 * TODO
 *
 * @author lizhifu
 * @since 2023/8/30
 */
public class OrderCommandService {
    private final OrderRepository orderRepository;

    public OrderCommandService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public void orderCreate(String orderNo, String orderStatus){
        Order order = new Order();
        order.setOrderStatus(orderStatus);
        order.setOrderNo(orderNo);
        orderRepository.save(order);
    }

    public void orderUpdate(String orderNo, String orderStatus){
        Order order = orderRepository.findByOrderNo(orderNo);
        order.setOrderStatus(orderStatus);
        orderRepository.save(order);
    }
}
