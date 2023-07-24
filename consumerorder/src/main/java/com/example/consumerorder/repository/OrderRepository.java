package com.example.consumerorder.repository;

import com.example.consumerorder.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface OrderRepository extends MongoRepository<Order, String> {
}
