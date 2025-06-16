package es.darioselor.domain.controller.user.webModel.Publisher;

import es.darioselor.domain.domain.user.model.Publisher;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-15T09:14:48+0200",
    comments = "version: 1.6.2, compiler: javac, environment: Java 21.0.7 (Amazon.com Inc.)"
)
public class PublisherMapperImpl implements PublisherMapper {

    @Override
    public PublisherCollection toPublisherCollection(Publisher publisher) {
        if ( publisher == null ) {
            return null;
        }

        long id = 0L;
        String name = null;

        id = publisher.getId();
        name = publisher.getName();

        PublisherCollection publisherCollection = new PublisherCollection( id, name );

        return publisherCollection;
    }
}
