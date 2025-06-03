package com.darioselor.examen.domain._4repository;

import com.darioselor.examen.domain._1model.Character;

import java.util.List;

public interface CharacterRepository {

    List<Character> getByGameCode(String gameCode);
    List<Character> findAllById(Long[] ids);
}
