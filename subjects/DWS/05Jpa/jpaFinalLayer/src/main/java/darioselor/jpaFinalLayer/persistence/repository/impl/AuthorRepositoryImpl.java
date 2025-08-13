package darioselor.jpaFinalLayer.persistence.repository.impl;

import darioselor.jpaFinalLayer.domain._1model.Author;
import darioselor.jpaFinalLayer.domain._4repository.AuthorRepository;
import darioselor.jpaFinalLayer.persistence.dao.db.AuthorDaoDb;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class AuthorRepositoryImpl implements AuthorRepository {
    private final AuthorDaoDb authorDaoDb;
    @Override
    public List<Author> findAllAuthorsByBookId(long id) {
        return authorDaoDb.findAllAuthorsByBookId(id);
    }

    @Override
    public List<Author> findAllAuthorsByBookIsbn(String isbn) {
        return authorDaoDb.findAllAuthorsByBookIsbn(isbn);
    }

    @Override
    public List<Author> findAllById(Long[] ids) {
        return authorDaoDb.findAllById(ids);
    }
}
