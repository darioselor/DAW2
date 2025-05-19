package es.darioselor.domain.domain.admin.service;

import es.darioselor.domain.domain.admin.model.Genre;

import java.util.List;

public interface GenreAdminService {
    List<Genre> findByBookId(Long idBook);

    List<Genre> findAllById(List<Genre> genres);
}
