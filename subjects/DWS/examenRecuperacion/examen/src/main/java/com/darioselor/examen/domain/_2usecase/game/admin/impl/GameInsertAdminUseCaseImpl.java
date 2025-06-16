package com.darioselor.examen.domain._2usecase.game.admin.impl;

import com.darioselor.examen.common.annotation.DomainTransactional;
import com.darioselor.examen.common.annotation.DomainUseCase;
import com.darioselor.examen.common.exception.ResourceAlreadyExistsException;
import com.darioselor.examen.common.exception.ResourceNotFoundException;
import com.darioselor.examen.domain._1model.Character;
import com.darioselor.examen.domain._1model.Game;
import com.darioselor.examen.domain._2usecase.game.admin.GameInsertAdminUseCase;
import com.darioselor.examen.domain._3service.CharacterService;
import com.darioselor.examen.domain._3service.DirectorService;
import com.darioselor.examen.domain._3service.GameService;
import lombok.RequiredArgsConstructor;



@DomainUseCase
@DomainTransactional
@RequiredArgsConstructor
public class GameInsertAdminUseCaseImpl implements GameInsertAdminUseCase {

    private final GameService gameService;
    private final CharacterService characterService;
    private final DirectorService directorService;

    @Override
    public void execute(Game game) {
        if (gameService.findByGameCode(game.getGameCode()).isPresent()){
            throw new ResourceAlreadyExistsException("Game with gamecode: "+game.getGameCode()+ " already exists.");
        }
        game.setDirector(directorService
                .findById(game.getDirector().getId())
                .orElseThrow(() -> new ResourceNotFoundException("Director "+game.getDirector().getName()+" not found.")));
        game.setCharacters(characterService
                .findAllById(game.getCharacters())
        );
        gameService.save(game);
    }
}
