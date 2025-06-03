package com.darioselor.examen.domain._2usecase.game.admin;

import com.darioselor.examen.domain._1model.Game;
import com.darioselor.examen.domain._1model.ListWithCount;

import java.util.List;

public interface GameGetAllAdminUseCase {
    ListWithCount<Game> execute();
}
