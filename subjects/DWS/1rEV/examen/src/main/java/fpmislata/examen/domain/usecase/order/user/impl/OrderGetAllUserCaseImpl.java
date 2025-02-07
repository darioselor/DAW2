package fpmislata.examen.domain.usecase.order.user.impl;

import java.util.List;

import fpmislata.examen.common.annotation.DomainTransactional;
import fpmislata.examen.common.annotation.DomainUseCase;
import fpmislata.examen.domain.repository.OrderRepository;
import fpmislata.examen.domain.service.OrderService;
import fpmislata.examen.domain.usecase.order.user.OrderGetAllUserUseCase;
import fpmislata.examen.domain.usecase.order.user.mapper.OrderMapper;
import fpmislata.examen.domain.usecase.order.user.model.OrderUser;
import lombok.RequiredArgsConstructor;

@DomainUseCase
@DomainTransactional
@RequiredArgsConstructor
public class OrderGetAllUserCaseImpl implements OrderGetAllUserUseCase {
    private final OrderService orderService;
    private final OrderRepository orderRepository;

    @Override
    public List<OrderUser> execute(int page, int pageSize) {
        return orderRepository
                .getAll()
                .stream()
                .map(OrderMapper.INSTANCE::toOrderUser)
                .toList();
    }
}
