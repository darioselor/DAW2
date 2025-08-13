package darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.mapper;

import darioselor.jpaFinalLayer.domain._1model.Publisher;
import darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.entity.PublisherEntity;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-08-13T21:01:45+0200",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
public class PublisherJpaMapperImpl implements PublisherJpaMapper {

    @Override
    public Publisher toPublisher(PublisherEntity publisherEntity) {
        if ( publisherEntity == null ) {
            return null;
        }

        Publisher publisher = new Publisher();

        publisher.setId( publisherEntity.getId() );
        publisher.setName( publisherEntity.getName() );
        publisher.setSlug( publisherEntity.getSlug() );

        return publisher;
    }

    @Override
    public PublisherEntity toPublisherEntity(Publisher publisher) {
        if ( publisher == null ) {
            return null;
        }

        PublisherEntity publisherEntity = new PublisherEntity();

        publisherEntity.setId( publisher.getId() );
        publisherEntity.setName( publisher.getName() );
        publisherEntity.setSlug( publisher.getSlug() );

        return publisherEntity;
    }
}
