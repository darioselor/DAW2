package fpmislata.examen.domain.repository;

import java.util.Optional;

import fpmislata.examen.domain.model.OrderDetails;

public interface OrderDetailsRepository {

    Optional<OrderDetails> getOrderDetailsByOrderID(Long id);
}
