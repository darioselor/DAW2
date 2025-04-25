package com.repaso.restaurante.domain.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class OrderDetail {
    private long id;
    private Product product;
    private int quantity;
    private float realPrize;
}
