package es.darioselor.domain.domain.admin.service;

import es.darioselor.domain.domain.admin.model.Category;

import java.util.Optional;

public interface CategoryAdminService {
    Optional<Category> findById(Long id);
}
