package darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.repository;

import darioselor.jpaFinalLayer.domain._1model.Author;
import darioselor.jpaFinalLayer.persistence.dao.db.impl.jpa.entity.AuthorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AuthorJpaRepository extends JpaRepository<AuthorEntity, Long> {

    @Query(value = "SELECT a.* FROM authors a " +
            "JOIN books_authors ba ON a.id = ba.author_id " +
            "JOIN books b ON ba.book_id = b.id " +
            "AND b.isbn = :isbn", nativeQuery = true)
    List<AuthorEntity> findAllAuthorsByBookIsbn(String isbn);

    @Query(value = "SELECT a.* FROM authors a " +
            "JOIN books_authors ba ON a.id = ba.author_id " +
            "AND ba.book_id = :id", nativeQuery = true)
    List<AuthorEntity> findAllAuthorsByBookId(@Param("id") Long id);

}
