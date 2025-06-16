package darioselor.jpaFinalLayer.controller.user.webmodel.publisher;

import darioselor.jpaFinalLayer.domain._1model.Publisher;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-06-03T07:54:08+0200",
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

        if ( publisher.getId() != null ) {
            id = publisher.getId();
        }
        name = publisher.getName();

        PublisherCollection publisherCollection = new PublisherCollection( id, name );

        return publisherCollection;
    }
}
