package com.example.presentationLayer.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Author {
    private long id;
    private String name;
    private String biography;
    private String nationality;
    private int birthYear;
    private int deathYear;
}
