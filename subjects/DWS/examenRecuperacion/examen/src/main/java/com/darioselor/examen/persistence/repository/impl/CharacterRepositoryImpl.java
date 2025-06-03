package com.darioselor.examen.persistence.repository.impl;

import com.darioselor.examen.domain._1model.Character;
import com.darioselor.examen.domain._4repository.CharacterRepository;
import com.darioselor.examen.persistence.dao.db.CharacterDaoDb;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CharacterRepositoryImpl implements CharacterRepository {

    private final CharacterDaoDb characterDaoDb;

    @Override
    public List<Character> getByGameCode(String gameCode) {
        return characterDaoDb.getByGameCode(gameCode);
    }

    @Override
    public List<Character> findAllById(Long[] ids) {
        return characterDaoDb.findAllById(ids);
    }
}
