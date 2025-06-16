package com.example.idiomaPaginacionRoles.controller.user.webModel.Publisher;

import com.example.idiomaPaginacionRoles.domain.user.model.Publisher;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-05-09T18:10:34+0200",
    comments = "version: 1.6.2, compiler: Eclipse JDT (IDE) 3.42.0.z20250331-1358, environment: Java 21.0.6 (Eclipse Adoptium)"
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
