package es.darioselor.domain.controller.user.webModel.Publisher;

import es.darioselor.domain.domain.user.model.Publisher;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PublisherMapper {
    PublisherMapper INSTANCE = Mappers.getMapper(PublisherMapper.class);

    PublisherCollection toPublisherCollection(Publisher publisher);
}
