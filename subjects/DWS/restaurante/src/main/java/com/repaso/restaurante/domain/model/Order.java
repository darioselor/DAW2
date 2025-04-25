package com.repaso.restaurante.domain.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Order {
    private long id;
    private int table;
    private List<OrderDetail> orderDetails;
    private Client client;

}
