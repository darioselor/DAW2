package com.example.demo.domain.usecase.game;

import com.example.demo.domain.model.Game;

public interface GameFindByGameCodeUseCase {
    Game execute(String gameCode);
}
