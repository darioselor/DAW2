package darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.mapper;

import darioselor.jpaFinalLayer.domain._1model.Publisher;
import darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.entity.PublisherEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PublisherJpaMapper {

    PublisherJpaMapper INSTANCE = Mappers.getMapper(PublisherJpaMapper.class);

    Publisher toPublisher(PublisherEntity publisherEntity);

    PublisherEntity toPublisherEntity(Publisher publisher);
}
