package es.darioselor.domain.domain.admin.model;

import es.darioselor.domain.domain.admin.model.Publisher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    private long id;
    private String isbn;
    private String titleEs;
    private String titleEn;
    private String synopsisEn;
    private String synopsisEs;
    private Publisher publisher;
    private List<Author> authors;
    private List <Genre> genres;

}
