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
    private String synopsis;
    private float price;
    private float discount;
    private int year;
    private String cover;
    private Category category;
    private List<Author> authors;
    private List<Genre> genres;
}
