package com.example.demo.persistence.dao.db;

import java.util.List;

import com.example.demo.domain.model.Character;

public interface CharacterDaoDb extends GenericDaoDb<Character> {

    List<Character> findByGameCode(String gameCode);

    List<Character> findAll();
}
