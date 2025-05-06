package com.example.idiomaPaginacionRoles.controller.webModel.Publisher;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.idiomaPaginacionRoles.domain.model.Publisher;

@Mapper
public interface PublisherMapper {
    PublisherMapper INSTANCE = Mappers.getMapper(PublisherMapper.class);

    PublisherCollection toPublisherCollection(Publisher publisher);
}
