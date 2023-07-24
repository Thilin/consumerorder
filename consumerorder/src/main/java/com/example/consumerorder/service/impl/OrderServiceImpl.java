package com.example.consumerorder.service.impl;

import com.example.consumerorder.entity.Order;
import com.example.consumerorder.repository.OrderRepository;
import com.example.consumerorder.service.OrderService;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService{


    private final OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    @Override
    public Iterable<Order> findAll() {
        return  orderRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }
}
