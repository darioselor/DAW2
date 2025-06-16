package com.darioselor.examen.domain._2usecase.game.admin.impl;

import com.darioselor.examen.common.annotation.DomainUseCase;
import com.darioselor.examen.common.exception.ResourceNotFoundException;
import com.darioselor.examen.domain._1model.Game;
import com.darioselor.examen.domain._2usecase.game.admin.GameFindByGameCodeAdminUseCase;
import com.darioselor.examen.domain._3service.GameService;
import lombok.RequiredArgsConstructor;

@DomainUseCase
@RequiredArgsConstructor
public class GameFindByGameCodeAdminUseCaseImpl implements GameFindByGameCodeAdminUseCase {

    private final GameService gameService;

    @Override
    public Game execute(String gameCode){
        return gameService
                .findByGameCode(gameCode)
                .orElseThrow(() -> new ResourceNotFoundException("Game with gamecode: "+gameCode+" not found."));
    }


}
