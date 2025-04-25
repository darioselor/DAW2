package com.repaso.restaurante.domain.repository;

import java.util.List;

import com.repaso.restaurante.domain.model.Order;

public interface OrderRepository {
    public List<Order> findAll();

    public Order findById();
}
