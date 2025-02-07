package com.fpmislata.demo.b_presentation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fpmislata.demo.b_presentation.mapper.GenreMapper;
import com.fpmislata.demo.b_presentation.model.GenreComplete;
import com.fpmislata.demo.b_presentation.model.GenreSimple;
import com.fpmislata.demo.b_presentation.model.Paginator;
import com.fpmislata.demo.c_domain.model.Genre;
import com.fpmislata.demo.c_domain.model.ListWithCount;
import com.fpmislata.demo.c_domain.usecase.genre.interfaces.GenreCreateUseCase;
import com.fpmislata.demo.c_domain.usecase.genre.interfaces.GenreDeleteUseCase;
import com.fpmislata.demo.c_domain.usecase.genre.interfaces.GenreFindAllUseCase;
import com.fpmislata.demo.c_domain.usecase.genre.interfaces.GenreFindAllWithCountUseCase;
import com.fpmislata.demo.c_domain.usecase.genre.interfaces.GenreFindByIdUseCase;
import com.fpmislata.demo.c_domain.usecase.genre.interfaces.GenreUpdateUseCase;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping(GenreController.ENDPOINT)
public class GenreController {

    private final GenreFindAllUseCase genreFindAllUseCase;
    private final GenreFindAllWithCountUseCase genreFindAllWithCountUseCase;
    private final GenreFindByIdUseCase genreFindByIdUseCase;
    private final GenreCreateUseCase genreCreateUseCase;
    private final GenreUpdateUseCase genreUpdateUseCase;
    private final GenreDeleteUseCase genreDeleteUseCase;

    @Value("${URL}")
    private String URL;
    public static final String ENDPOINT = "/genres";

    @GetMapping()
    public ResponseEntity<List<GenreSimple>> findAll() {
        List<Genre> genreList = genreFindAllUseCase.execute();
        List<GenreSimple> genreSimpleList = GenreMapper.INSTANCE.toGenreSimpleList(genreList);

        return ResponseEntity.ok(genreSimpleList);
    }

    @GetMapping("/paginator")
    public ResponseEntity<Paginator<GenreSimple>> findAllAllWithCount(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer pageSize) {

        ListWithCount<Genre> genreListWithCount = genreFindAllWithCountUseCase.execute(page, pageSize);

        List<GenreSimple> genreSimpleList = GenreMapper.INSTANCE.toGenreSimpleList(genreListWithCount.getList());
        Integer total = genreListWithCount.getCount();
        String baseURL = URL + ENDPOINT;

        Paginator<GenreSimple> genreSimplePaginator = new Paginator<>(genreSimpleList, total, page, pageSize, baseURL);

        return ResponseEntity.ok(genreSimplePaginator);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GenreComplete> findById(@PathVariable Integer id) {
        Genre genre = genreFindByIdUseCase.execute(id);
        GenreComplete genreComplete = GenreMapper.INSTANCE.toGenreComplete(genre);

        return ResponseEntity.ok(genreComplete);
    }

    @PostMapping()
    public ResponseEntity<Void> create(@Valid @RequestBody GenreComplete genreComplete) {
        genreCreateUseCase.execute(GenreMapper.INSTANCE.toGenre(genreComplete));

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable Integer id, @Valid @RequestBody GenreComplete genreComplete) {
        Genre genre = GenreMapper.INSTANCE.toGenre(genreComplete);
        genre.setId(id);
        genreUpdateUseCase.execute(genre);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id) {
        genreDeleteUseCase.execute(id);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}