package com.example.consumerorder.service;

import com.example.consumerorder.entity.Order;

public interface OrderService {
    Iterable<Order> findAll();
}
