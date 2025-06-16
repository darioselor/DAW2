package com.darioselor.examen.domain._2usecase.game.admin;

import com.darioselor.examen.domain._1model.Game;

public interface GameFindByGameCodeAdminUseCase {
    Game execute(String gameCode);
}
