package fpmislata.examen.domain.usecase.order.common.impl;

import fpmislata.examen.common.annotation.DomainTransactional;
import fpmislata.examen.common.annotation.DomainUseCase;
import fpmislata.examen.domain.service.OrderService;
import fpmislata.examen.domain.usecase.order.common.OrderCountUseCase;
import lombok.RequiredArgsConstructor;

@DomainUseCase
@DomainTransactional
@RequiredArgsConstructor
public class OrderCountUseCaseImpl implements OrderCountUseCase {

    private final OrderService orderService;

    @Override
    public int execute() {
        return orderService.count();
    }
}
