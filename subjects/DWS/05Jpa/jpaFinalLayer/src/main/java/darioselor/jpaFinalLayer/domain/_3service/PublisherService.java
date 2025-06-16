package darioselor.jpaFinalLayer.domain._3service;

import darioselor.jpaFinalLayer.domain._1model.Publisher;

import java.util.Optional;

public interface PublisherService {
    Optional<Publisher> findById(Long id);
}
