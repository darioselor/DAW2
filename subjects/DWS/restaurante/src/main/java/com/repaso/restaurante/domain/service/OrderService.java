package com.repaso.restaurante.domain.service;

import java.util.List;

import com.repaso.restaurante.domain.model.Order;

public interface OrderService {
    public List<Order> findAll();

    public Order findByID();

}
