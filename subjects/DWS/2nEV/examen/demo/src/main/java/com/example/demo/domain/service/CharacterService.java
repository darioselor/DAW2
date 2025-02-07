package com.example.demo.domain.service;

import java.util.List;

import com.example.demo.domain.model.Character;

public interface CharacterService {
    List<Character> getAll();

    List<Character> getCharacterByGameId(Long gameId);
}
