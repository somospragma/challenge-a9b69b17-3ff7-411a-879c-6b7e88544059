package com.pragma.orders.application;

import com.pragma.orders.domain.Order;
import com.pragma.orders.infrastructure.OrderRepository;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public Order createOrder(String customerId, String itemId, int quantity) {
        Order order = new Order(customerId, itemId, quantity);
        orderRepository.save(order);
        return order;
    }
}