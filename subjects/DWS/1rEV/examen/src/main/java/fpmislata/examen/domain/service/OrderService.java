package fpmislata.examen.domain.service;

import java.util.List;
import java.util.Optional;

import fpmislata.examen.domain.model.Order;

public interface OrderService {

    List<Order> findAll();

    Optional<Order> getByID(Long id);

    int count();
}
