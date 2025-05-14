package es.darioselor.domain.persistence.admin.repository;

import es.darioselor.domain.domain.admin.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository

public interface BookAdminRepository {
    List<Book> findAll();
    List<Book> findAll(int page, int pageSize);
    int count();
    Optional<Book> findByIsbn(String isbn);
}
