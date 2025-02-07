package com.example.demo.domain.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.example.demo.domain.model.Director;
import com.example.demo.domain.model.Character;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Game {

    private Long id;
    private String game_code;
    private String title;
    private String description;
    private Integer release_year;
    private List<Character> characters;
    private List<Director> directors;

}
