package es.darioselor.domain.domain.user.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private long id;
    private String isbn;
    private String title;
    private Publisher publisher;
    private int year;
    private String cover;
    private List<Author> authors;
    private List<Genre> genres;
}
