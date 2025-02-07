package fpmislata.examen.domain.usecase.order.user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import fpmislata.examen.domain.model.OrderDetails;
import fpmislata.examen.domain.usecase.order.user.model.OrderDetailsUser;

@Mapper(uses = BookMapper.class)
public interface OrderDetailsMapper {
    OrderDetailsMapper INSTANCE = Mappers.getMapper(OrderDetailsMapper.class);

    OrderDetailsUser tOrderDetailsUser(OrderDetails orderDetails);
}
