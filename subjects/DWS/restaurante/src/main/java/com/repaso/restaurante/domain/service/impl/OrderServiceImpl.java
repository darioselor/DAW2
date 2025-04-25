package com.repaso.restaurante.domain.service.impl;

import java.util.List;

import com.repaso.restaurante.domain.model.Order;
import com.repaso.restaurante.domain.repository.OrderRepository;
import com.repaso.restaurante.domain.service.OrderService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findByID() {
        return orderRepository.findById();
    }

}
