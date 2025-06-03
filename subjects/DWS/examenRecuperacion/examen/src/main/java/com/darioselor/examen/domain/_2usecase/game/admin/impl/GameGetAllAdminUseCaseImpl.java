package com.darioselor.examen.domain._2usecase.game.admin.impl;

import com.darioselor.examen.common.annotation.DomainTransactional;
import com.darioselor.examen.common.annotation.DomainUseCase;
import com.darioselor.examen.domain._1model.Game;
import com.darioselor.examen.domain._1model.ListWithCount;
import com.darioselor.examen.domain._2usecase.game.admin.GameGetAllAdminUseCase;
import com.darioselor.examen.domain._3service.GameService;
import lombok.RequiredArgsConstructor;



@DomainUseCase
@DomainTransactional
@RequiredArgsConstructor
public class GameGetAllAdminUseCaseImpl implements GameGetAllAdminUseCase {

    private final GameService gameService;

    @Override
    public ListWithCount<Game> execute(int page, int pageSize) {
        return gameService.getAll(page, pageSize);
    }
}
