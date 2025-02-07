package com.example.demo.domain.usecase.game;

import java.util.List;

import com.example.demo.domain.model.Game;

public interface GameGetAllUseCase {

    List<Game> execute();
}
