package com.example.consumerorder.entity;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.UUID;


@Data
@Document(collection = "Order")
public class Order{

    @Id
    private String order;
    private String origin;
    private Float total;
    private String createdAt;
    private List<Item> items;
}
