package darioselor.jpaFinalLayer.domain._4repository;

import darioselor.jpaFinalLayer.domain._1model.Publisher;

import java.util.Optional;

public interface PublisherRepository {
    Optional<Publisher> findById(long id);
}
