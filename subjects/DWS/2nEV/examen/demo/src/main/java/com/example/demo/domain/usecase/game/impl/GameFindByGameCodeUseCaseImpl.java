package com.example.demo.domain.usecase.game.impl;

import com.example.demo.common.annotation.DomainUseCase;
import com.example.demo.common.exception.ResourceNotFoundException;
import com.example.demo.domain.model.Game;
import com.example.demo.domain.service.GameService;
import com.example.demo.domain.usecase.game.GameFindByGameCodeUseCase;

import lombok.RequiredArgsConstructor;

@DomainUseCase
@RequiredArgsConstructor
public class GameFindByGameCodeUseCaseImpl implements GameFindByGameCodeUseCase {

    private final GameService gameService;

    @Override
    public Game execute(String gameCode) {
        return gameService.findByGameCode(gameCode)
                .orElseThrow(() -> new ResourceNotFoundException("Game not found"));
    }

}
