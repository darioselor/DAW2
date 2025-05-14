package es.darioselor.domain.persistence.admin.repository;

import es.darioselor.domain.domain.admin.model.Author;

import java.util.List;


public interface AuthorAdminRepository {

    List<Author> findAuthorsByBookIsbn(String isbn);
}
