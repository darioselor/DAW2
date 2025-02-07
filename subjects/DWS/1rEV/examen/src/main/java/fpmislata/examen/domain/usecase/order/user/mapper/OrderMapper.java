package fpmislata.examen.domain.usecase.order.user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import fpmislata.examen.domain.model.Order;
import fpmislata.examen.domain.usecase.order.user.model.OrderUser;

@Mapper(uses = { OrderDetailsMapper.class, UserMapper.class })
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);

    OrderUser toOrderUser(Order order);
}
