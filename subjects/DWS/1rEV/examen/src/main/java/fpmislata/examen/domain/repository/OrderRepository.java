package fpmislata.examen.domain.repository;

import java.util.List;
import java.util.Optional;

import fpmislata.examen.domain.model.Order;

public interface OrderRepository {

    List<Order> getAll();

    Optional<Order> getById(Long id);

    int count();
}
