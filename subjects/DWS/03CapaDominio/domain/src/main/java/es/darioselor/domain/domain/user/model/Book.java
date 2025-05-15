package es.darioselor.domain.domain.user.model;

import es.darioselor.common.exception.ResourceAlreadyExistsException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    private String isbn;
    private String title;
    private String synopsis;
    private float price;
    private float discount;
    private String cover;
    private Publisher publisher;
    private Category category;
    private List<Author> authors;
    private List<Genre> genres;

    public void addAuthor (Author author) {
        if (authors == null) {
            authors = new ArrayList<>();
        }
        if (authors.contains(author)){
            throw new ResourceAlreadyExistsException("Author " + author.getName() + " already exists");
        }
        authors.add(author);
    }
}

