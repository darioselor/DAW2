package com.example.idiomaPaginacionRoles.persistence.user.repository;

import java.util.List;

import com.example.idiomaPaginacionRoles.domain.user.model.Author;

public interface AuthorRepository {
    public List<Author> findAuthorsByBookIsbn(String isbn);
}
