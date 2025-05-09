package com.example.idiomaPaginacionRoles.persistence.admin.repository;

import com.example.idiomaPaginacionRoles.domain.admin.model.Author;

import java.util.List;

public interface AuthorAdminRepository {
    List<Author> findAuthorByBookIsbn(String isbn);

}
