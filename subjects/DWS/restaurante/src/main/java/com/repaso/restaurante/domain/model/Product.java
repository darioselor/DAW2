package com.repaso.restaurante.domain.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private long id;
    private String name;
    private float prize;
    private int stock;
}
