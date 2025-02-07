package fpmislata.examen.domain.usecase.order.user;

import java.util.List;

import fpmislata.examen.domain.usecase.order.user.model.OrderUser;

public interface OrderGetAllUserUseCase {
    List<OrderUser> execute(int page, int pageSize);
}
