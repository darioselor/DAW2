package fpmislata.examen.domain.service;

import java.util.Optional;

import fpmislata.examen.domain.model.OrderDetails;

public interface OrderDetailsService {
    Optional<OrderDetails> getOrderDetailsByOrderID(Long id);

}
