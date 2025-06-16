package com.darioselor.examen.domain._1model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Game {
    private long id;
    private String gameCode;
    private String title;
    private int releaseYear;
    private String description;
    private Director director;
    private List<Character> characters;

}
