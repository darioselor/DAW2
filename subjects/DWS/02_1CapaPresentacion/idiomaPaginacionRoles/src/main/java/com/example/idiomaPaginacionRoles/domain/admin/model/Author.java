package com.example.idiomaPaginacionRoles.domain.admin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    private long id;
    private String name;
    private String nationality;
    private String biographyEs;
    private String biographyEn;
    private int birthYear;
    private int deathYear;
}
