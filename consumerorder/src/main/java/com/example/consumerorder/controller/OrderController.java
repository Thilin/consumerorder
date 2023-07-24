package com.example.consumerorder.controller;

import com.example.consumerorder.entity.Order;
import com.example.consumerorder.service.OrderService;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService = orderService;
    }

    @QueryMapping
    public Iterable<Order> placedOrders(){
        return orderService.findAll();
    }
}
