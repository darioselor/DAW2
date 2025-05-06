package com.example.idiomaPaginacionRoles.persistence.repository;

import java.util.List;

import com.example.idiomaPaginacionRoles.domain.model.Author;

public interface AuthorRepository {
    public List<Author> findAuthorsByBookIsbn(String isbn);
}
