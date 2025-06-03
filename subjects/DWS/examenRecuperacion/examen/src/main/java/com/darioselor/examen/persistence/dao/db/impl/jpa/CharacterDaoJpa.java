package com.darioselor.examen.persistence.dao.db.impl.jpa;

import com.darioselor.examen.domain._1model.Character;
import com.darioselor.examen.domain._1model.ListWithCount;
import com.darioselor.examen.persistence.dao.db.CharacterDaoDb;
import com.darioselor.examen.persistence.dao.db.impl.jpa.entity.CharacterEntity;
import com.darioselor.examen.persistence.dao.db.impl.jpa.mapper.CharacterJpaMapper;
import com.darioselor.examen.persistence.dao.db.impl.jpa.repository.CharacterJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("authorDaoJpa")
@RequiredArgsConstructor
public class CharacterDaoJpa implements CharacterDaoDb {

    private final CharacterJpaRepository characterJpaRepository;


    @Override
    public List<Character> getByGameCode(String gameCode) {
        return characterJpaRepository
                .findByGameCode(gameCode)
                .stream()
                .map(CharacterJpaMapper.INSTANCE::toCharacter)
                .toList();
    }

    @Override
    public List<Character> findAllById(Long[] ids) {
        return characterJpaRepository
                .findAllById(List.of(ids))
                .stream()
                .map(CharacterJpaMapper.INSTANCE::toCharacter)
                .toList();
    }

    @Override
    public List<Character> getAll() {
        return characterJpaRepository.findAll()
                .stream()
                .map(CharacterJpaMapper.INSTANCE::toCharacter)
                .toList();
    }

    @Override
    public ListWithCount<Character> getAll(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<CharacterEntity> characterEntities = characterJpaRepository.findAll(pageable);
        return new ListWithCount<>(
                characterEntities.getContent()
                        .stream()
                        .map(CharacterJpaMapper.INSTANCE::toCharacter)
                        .toList(),
                characterEntities.getNumberOfElements()
        );
    }

    @Override
    public Optional<Character> findById(long id) {
        return characterJpaRepository.findById(id)
                .map(CharacterJpaMapper.INSTANCE::toCharacter);
    }

    @Override
    public String insert(Character character) {
        CharacterEntity characterEntity = characterJpaRepository
                .save(CharacterJpaMapper.INSTANCE.toCharacterEntity(character));
        return characterEntity.getName();
    }

    @Override
    public void update(Character character) {
        characterJpaRepository.save(CharacterJpaMapper.INSTANCE.toCharacterEntity(character));
    }

    @Override
    public void delete(long id) {
        characterJpaRepository.deleteById(id);
    }

    @Override
    public long count() {
        return characterJpaRepository.count();
    }

    @Override
    public Character save(Character character) {
        return CharacterJpaMapper.INSTANCE.toCharacter(
                characterJpaRepository.save(CharacterJpaMapper.INSTANCE.toCharacterEntity(character))
        );
    }
}
