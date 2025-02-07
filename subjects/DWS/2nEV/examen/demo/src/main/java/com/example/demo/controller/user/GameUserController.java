package com.example.demo.controller.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import org.springframework.http.ResponseEntity;
import com.example.demo.config.PropertiesConfig;
import com.example.demo.domain.usecase.game.GameGetAllUseCase;
import com.example.demo.domain.model.GameResponse;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("${app.api.path}/games")
public class GameUserController {
    public static final String URL = PropertiesConfig.getSetting("app.api.path") + "/games";

    private final GameGetAllUseCase gameGetAllUseCase;
    private final GameGetByIdUseCase gameGetByIdUseCase;
    private final GameCreateUseCase gameCreateUseCase;

    @GetMapping
    public ResponseEntity<List<GameResponse>> findAll() {
        return ResponseEntity.ok(gameGetAllUseCase.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<GameResponse> getById(@PathVariable Long id) {
        return ResponseEntity.ok(gameGetByIdUseCase.getById(id));
    }

}
