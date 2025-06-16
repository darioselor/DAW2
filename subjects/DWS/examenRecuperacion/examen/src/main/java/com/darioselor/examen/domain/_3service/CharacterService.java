package com.darioselor.examen.domain._3service;

import com.darioselor.examen.domain._1model.Character;

import java.util.List;

public interface CharacterService {
    List<Character> findAllById(List<Character> characters);
    List<Character> getByGameCode(String gameCode);
}
