package com.darioselor.examen.domain._3service.impl;

import com.darioselor.examen.common.annotation.DomainService;
import com.darioselor.examen.common.exception.ResourceNotFoundException;
import com.darioselor.examen.domain._1model.Character;
import com.darioselor.examen.domain._3service.CharacterService;
import com.darioselor.examen.domain._4repository.CharacterRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@DomainService
@RequiredArgsConstructor
public class CharacterServiceImpl implements CharacterService {

    private final CharacterRepository characterRepository;

    @Override
    public List<Character> findAllById(List<Character> characters) {
        List<Character> foundCharacters =  characterRepository.findAllById(
                characters
                        .stream()
                        .map(Character::getId)
                        .toArray(Long[]::new)

        );
        if (foundCharacters.size() != characters.size()){
            throw new ResourceNotFoundException("Some Characters were not found.");
        }
        return foundCharacters;
    }

    @Override
    public List<Character> getByGameCode(String gameCode) {
        return characterRepository.getByGameCode(gameCode);
    }
}
