package es.darioselor.domain.persistence.user.repository;

import es.darioselor.domain.domain.user.model.Author;

import java.util.List;

public interface AuthorUserRepository {
    List<Author> findAuthorsByBookIsbn(String isbn);
}
