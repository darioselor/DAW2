package es.darioselor.domain.domain.admin.model;

import es.darioselor.domain.controller.common.locale.LanguageUtils;
import es.darioselor.domain.domain.admin.model.Publisher;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
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

    public String getTitle() {
        String language = LanguageUtils.getCurrentLanguage();
        if (language.equals("es")) {
            return titleEs;
        }
        return titleEn;
    }
}
