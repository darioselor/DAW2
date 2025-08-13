package com.darioselor.examen.controller.admin;

import com.darioselor.examen.config.PropertiesConfig;
import com.darioselor.examen.controller.PaginatedResponse;
import com.darioselor.examen.controller.admin.webmodel.game.GameCollection;
import com.darioselor.examen.controller.admin.webmodel.game.GameMapper;
import com.darioselor.examen.domain._1model.Game;
import com.darioselor.examen.domain._1model.ListWithCount;
import com.darioselor.examen.domain._2usecase.game.admin.GameFindByGameCodeAdminUseCase;
import com.darioselor.examen.domain._2usecase.game.admin.GameGetAllAdminUseCase;
import com.darioselor.examen.domain._2usecase.game.admin.GameInsertAdminUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequiredArgsConstructor
@RequestMapping("${app.admin.path}/games")
public class GameAdminController {

    public static final String URL = PropertiesConfig.getSetting("app.admin.path") + "/books";
    private final String defaultPageSize = PropertiesConfig.getSetting("app.pageSize.default");


    private final GameGetAllAdminUseCase gameAdminGetAllUseCase;
    private final GameFindByGameCodeAdminUseCase gameFindByGameCodeAdminUseCase;
    private final GameInsertAdminUseCase gameInsertAdminUseCase;

    @GetMapping
    public ResponseEntity<PaginatedResponse<GameCollection>> getAll(
            @RequestParam(defaultValue = "1") int page,
            @RequestParam(required = false) Integer size
    ){
        int pageSize = (size != null) ? size : Integer.parseInt(defaultPageSize);
        String baseUrl = PropertiesConfig.getSetting("app.base.url") + URL;
        ListWithCount<Game> gameList = gameAdminGetAllUseCase.execute(page - 1, pageSize);
        PaginatedResponse<GameCollection> response = new PaginatedResponse<>(
                gameList
                        .getList()
                        .stream()
                        .map(GameMapper.INSTANCE::toGameCollection)
                        .toList(),
                page,
                pageSize,
                0,
                baseUrl
        );
        return ResponseEntity.ok(response);
    }
}
