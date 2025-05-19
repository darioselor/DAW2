package es.darioselor.domain.domain.admin.repository;

import es.darioselor.domain.domain.admin.model.Author;

import java.util.List;

public interface AuthorAdminRepository {
    List<Author> findAuthorsByBookIsbn(String isbn);
    List<Author> findAuthorsByBookId(Long id);

    List<Author> findAllById(Long[] ids);
}
