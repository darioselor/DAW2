package es.darioselor.domain.domain.admin.service;

import es.darioselor.domain.domain.admin.model.Author;

import java.util.List;

public interface AuthorAdminService {
    List<Author> getByIdBook(long idBook);

    List<Author> findAllById(List<Author> authors);
}
