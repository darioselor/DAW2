package fpmislata.examen.domain.usecase.order.user;

import fpmislata.examen.domain.usecase.order.user.model.OrderUser;

public interface OrderFindByIdUserUseCase {

    OrderUser execute(Long id);

}
