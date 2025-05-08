package com.example.idiomaPaginacionRoles.domain.admin.model;

import com.example.idiomaPaginacionRoles.controller.common.locale.LanguageUtils;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

    public String getTitle() {
        String language = LanguageUtils.getCurrentLanguage();
        if (language.equals("es")) {
            return titleEs;
        }
        return titleEn;
    }


}