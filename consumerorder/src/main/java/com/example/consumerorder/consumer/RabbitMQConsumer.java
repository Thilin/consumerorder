package com.example.consumerorder.consumer;

import com.example.consumerorder.entity.Order;
import com.example.consumerorder.repository.OrderRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Service
public class RabbitMQConsumer {

    private final OrderRepository orderRepository;

    public RabbitMQConsumer(OrderRepository orderRepository){
        this.orderRepository = orderRepository;
    }

    private static final Logger LOGGER = LoggerFactory.getLogger(RabbitMQConsumer.class);

    @RabbitListener(queues = {"${rabbitmq.queue.name}"})
    public void consumer(String message) throws JsonProcessingException {
        LOGGER.info(String.format("Received message -> %s", message));
        Order order = new Gson().fromJson(message, Order.class);

        orderRepository.save(order);
    }
}
