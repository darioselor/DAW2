package fpmislata.examen.domain.service.impl;

import java.util.List;
import java.util.Optional;

import fpmislata.examen.common.annotation.DomainService;
import fpmislata.examen.domain.model.Order;
import fpmislata.examen.domain.repository.OrderRepository;
import fpmislata.examen.domain.service.OrderService;
import lombok.RequiredArgsConstructor;

@DomainService
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public List<Order> findAll() {
        return orderRepository.getAll();
    }

    @Override
    public Optional<Order> getByID(Long id) {
        return orderRepository.getById(id);
    }

    @Override
    public int count() {
        return orderRepository.count();
    }

}
