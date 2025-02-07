package com.example.demo.domain.repository;

import java.util.List;

import com.example.demo.domain.model.Character;

public interface CharacterRepository {

    List<Character> findAll();

    List<Character> findByGameCode(String gameCode);

}
