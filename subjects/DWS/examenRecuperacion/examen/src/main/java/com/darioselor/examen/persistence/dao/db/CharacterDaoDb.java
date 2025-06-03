package com.darioselor.examen.persistence.dao.db;

import com.darioselor.examen.domain._1model.Character;

import java.util.List;

public interface CharacterDaoDb extends GenericDaoDb<Character> {
    List<Character> getByGameCode(String gameCode);
    List<Character> findAllById(Long[] ids);
}
