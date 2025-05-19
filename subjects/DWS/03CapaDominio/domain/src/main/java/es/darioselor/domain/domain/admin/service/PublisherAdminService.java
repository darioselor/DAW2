package es.darioselor.domain.domain.admin.service;

import es.darioselor.domain.domain.admin.model.Publisher;

import java.util.Optional;

public interface PublisherAdminService {
    Optional<Publisher> findById (Long id);
}
