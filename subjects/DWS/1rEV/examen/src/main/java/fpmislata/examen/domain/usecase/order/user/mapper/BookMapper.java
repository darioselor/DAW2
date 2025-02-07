package fpmislata.examen.domain.usecase.order.user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import fpmislata.examen.domain.model.Book;
import fpmislata.examen.domain.usecase.order.user.model.BookUser;

@Mapper
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookUser toBookUser(Book Book);

}
