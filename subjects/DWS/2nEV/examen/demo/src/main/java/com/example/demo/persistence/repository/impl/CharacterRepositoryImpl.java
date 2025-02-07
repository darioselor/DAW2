package com.example.demo.persistence.repository.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.domain.model.Character;
import com.example.demo.domain.repository.CharacterRepository;
import com.example.demo.persistence.dao.db.CharacterDaoDb;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class CharacterRepositoryImpl implements CharacterRepository {

    private final CharacterDaoDb characterDaoDb;

    public List<Character> findAll() {
        return characterDaoDb.findAll();
    }

    public List<Character> findByGameCode(String gameCode) {
        return characterDaoDb.findByGameCode(gameCode);
    }

}
