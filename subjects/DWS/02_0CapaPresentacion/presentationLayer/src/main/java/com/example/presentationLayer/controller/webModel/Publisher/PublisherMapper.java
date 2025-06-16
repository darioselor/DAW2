package com.example.presentationLayer.controller.webModel.Publisher;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.presentationLayer.domain.model.Publisher;

@Mapper
public interface PublisherMapper {
    PublisherMapper INSTANCE = Mappers.getMapper(PublisherMapper.class);

    PublisherCollection toPublisherCollection(Publisher publisher);
}
