package com.tomato.architectural.cqrs.service.queries;

import com.tomato.architectural.cqrs.domain.Order;
import com.tomato.architectural.cqrs.dto.OrderDTO;
import com.tomato.architectural.cqrs.repository.OrderRepository;
import org.springframework.beans.BeanUtils;

/**
 * 仓储
 *
 * @author lizhifu
 * @since 2023/8/30
 */
public class OrderQueryService {
    private final OrderRepository orderRepository;

    public OrderQueryService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public OrderDTO query(String orderNo) {
        Order order = orderRepository.findByOrderNo(orderNo);

        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(order, orderDTO);

        return orderDTO;
    }
}
