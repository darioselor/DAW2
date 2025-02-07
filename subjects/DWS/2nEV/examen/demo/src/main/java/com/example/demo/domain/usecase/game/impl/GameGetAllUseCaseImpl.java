package com.example.demo.domain.usecase.game.impl;

import java.util.List;

import com.example.demo.common.annotation.DomainTransactional;
import com.example.demo.common.annotation.DomainUseCase;
import com.example.demo.domain.model.Game;
import com.example.demo.domain.service.GameService;
import com.example.demo.domain.usecase.game.GameGetAllUseCase;

import lombok.RequiredArgsConstructor;

@DomainUseCase
@DomainTransactional
@RequiredArgsConstructor

public class GameGetAllUseCaseImpl implements GameGetAllUseCase {

    private final GameService gameService;

    @Override
    public List<Game> execute() {
        return gameService.findAll();
    }

}
