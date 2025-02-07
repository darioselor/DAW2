package fpmislata.examen.domain.usecase.order.user.mapper;

import org.mapstruct.factory.Mappers;

import fpmislata.examen.domain.model.User;
import fpmislata.examen.domain.usecase.order.user.model.UserUser;

public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserUser toUserUser(User Userr);

}
