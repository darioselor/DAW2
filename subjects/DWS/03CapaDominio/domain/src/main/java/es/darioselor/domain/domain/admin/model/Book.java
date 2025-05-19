package es.darioselor.domain.domain.admin.model;

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
    private Long id;
    private String isbn;
    private String titleEs;
    private String titleEn;
    private String synopsisEs;
    private String synopsisEn;
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

