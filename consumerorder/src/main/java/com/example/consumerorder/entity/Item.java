package com.example.consumerorder.entity;

import lombok.Data;

@Data
public class Item {

    private String name;
    private String image;
    private Integer qty;
    private Float cost;
    private String currency;
}
