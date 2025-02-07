package fpmislata.examen.domain.usecase.order.user.impl;

import java.util.List;

import fpmislata.examen.common.annotation.DomainTransactional;
import fpmislata.examen.common.annotation.DomainUseCase;
import fpmislata.examen.common.exception.ResourceNotFoundException;
import fpmislata.examen.domain.service.OrderDetailsService;
import fpmislata.examen.domain.service.OrderService;
import fpmislata.examen.domain.service.UserService;
import fpmislata.examen.domain.usecase.order.user.OrderFindByIdUserUseCase;
import fpmislata.examen.domain.usecase.order.user.mapper.OrderDetailsMapper;
import fpmislata.examen.domain.usecase.order.user.mapper.OrderMapper;
import fpmislata.examen.domain.usecase.order.user.model.OrderDetailsUser;
import fpmislata.examen.domain.usecase.order.user.model.OrderUser;
import lombok.RequiredArgsConstructor;

@DomainUseCase
@DomainTransactional
@RequiredArgsConstructor
public class OrderFindByIdUserUseCaseImpl implements OrderFindByIdUserUseCase {

    private final OrderService orderService;
    private final OrderDetailsService orderDetailsService;
    private final UserService userService;

    @Override
    public OrderUser execute(Long id) {
        OrderUser orderUser = OrderMapper.INSTANCE.toOrderUser(
                OrderService.getByID(id)
                        .orElseThrow(() -> new ResourceNotFoundException("Order id: " + id + " not found")));
        OrderDetailsUser orderDetailsUser = orderDetailsService
                .getOrderDetailsByOrderID(orderUser.getId())
                .stream()
                .map(OrderDetailsMapper.INSTANCE::tOrderDetailsUser);
    }

}
