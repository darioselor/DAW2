package fpmislata.examen.domain.service.impl;

import java.util.Optional;

import fpmislata.examen.common.annotation.DomainService;
import fpmislata.examen.domain.model.OrderDetails;
import fpmislata.examen.domain.repository.OrderDetailsRepository;
import fpmislata.examen.domain.service.OrderDetailsService;
import lombok.RequiredArgsConstructor;

@DomainService
@RequiredArgsConstructor
public class OrderDetailsServiceImpl implements OrderDetailsService {
    private final OrderDetailsRepository orderDetailsRepository;

    @Override
    public Optional<OrderDetails> getOrderDetailsByOrderID(Long id) {
        return orderDetailsRepository.getOrderDetailsByOrderID(id);
    }

}
