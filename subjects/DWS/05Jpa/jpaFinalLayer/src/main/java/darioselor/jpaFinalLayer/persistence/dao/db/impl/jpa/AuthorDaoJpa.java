package darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa;

import darioselor.jpaFinalLayer.domain._1model.Author;
import darioselor.jpaFinalLayer.domain._1model.ListWithCount;
import darioselor.jpaFinalLayer.persistence.dao.db.AuthorDaoDb;
import darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.entity.AuthorEntity;
import darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.mapper.AuthorJpaMapper;
import darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.repository.AuthorJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("authorDaoJpa")
@Primary
@RequiredArgsConstructor
public class AuthorDaoJpa implements AuthorDaoDb {

    private final AuthorJpaRepository authorJpaRepository;

    @Override
    public List<Author> findAllAuthorsByBookIsbn(String isbn) {
        return authorJpaRepository
                .findAllAuthorsByBookIsbn(isbn)
                .stream()
                .map(AuthorJpaMapper.INSTANCE::toAuthor)
                .toList();
    }

    @Override
    public List<Author> findAllAuthorsByBookId(long id) {
        return authorJpaRepository
                .findAllAuthorsByBookId(id)
                .stream()
                .map(AuthorJpaMapper.INSTANCE::toAuthor)
                .toList();
    }

    @Override
    public List<Author> findAllById(Long[] ids) {
        return authorJpaRepository
                .findAllById(List.of(ids))
                .stream()
                .map(AuthorJpaMapper.INSTANCE::toAuthor)
                .toList();
    }

    @Override
    public List<Author> findAll() {
        return authorJpaRepository.findAll()
                .stream()
                .map(AuthorJpaMapper.INSTANCE::toAuthor)
                .toList();
    }

    @Override
    public ListWithCount<Author> findAll(int page, int pageSize) {
        Pageable pageable = PageRequest.of(page, pageSize);
        Page<AuthorEntity> authorEntities = authorJpaRepository.findAll(pageable);
        return new ListWithCount<>(
                authorEntities.getContent().stream()
                        .map(AuthorJpaMapper.INSTANCE::toAuthor)
                        .toList(),
                authorEntities.getNumberOfElements()
        );
    }

    @Override
    public Optional<Author> findById(long id) {
        return authorJpaRepository.findById(id)
                .map(AuthorJpaMapper.INSTANCE::toAuthor);
    }

    @Override
    public long insert(Author author) {
        AuthorEntity authorEntity = authorJpaRepository
                .save(AuthorJpaMapper.INSTANCE.toAuthorEntity(author));
        return authorEntity.getId();
    }

    @Override
    public void update(Author author) {
        authorJpaRepository.save(AuthorJpaMapper.INSTANCE.toAuthorEntity(author));
    }

    @Override
    public void delete(long id) {
        authorJpaRepository.deleteById(id);
    }

    @Override
    public long count() {
        return authorJpaRepository.count();
    }

    @Override
    public Author save(Author author) {
        return AuthorJpaMapper.INSTANCE.toAuthor(
                authorJpaRepository.save(AuthorJpaMapper.INSTANCE.toAuthorEntity(author))
        );
    }
}
