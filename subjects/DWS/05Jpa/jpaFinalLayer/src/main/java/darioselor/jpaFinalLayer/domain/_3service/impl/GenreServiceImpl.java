package darioselor.jpaFinalLayer.domain._3service.impl;

import darioselor.jpaFinalLayer.common.exception.ResourceNotFoundException;
import darioselor.jpaFinalLayer.domain._1model.Genre;
import darioselor.jpaFinalLayer.domain._3service.GenreService;
import darioselor.jpaFinalLayer.domain._4repository.GenreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GenreServiceImpl implements GenreService {
    private final GenreRepository genreRepository;
    @Override
    public List<Genre> findByBookId(Long bookId) {
        return genreRepository.findAllGenresByBookId(bookId);
    }

    @Override
    public List<Genre> findAllById(List<Genre> genres) {
        List<Genre> foundGenres = genreRepository.findAllById(
                genres
                        .stream()
                        .map(Genre :: getId)
                        .toArray(Long[]::new)

        );
        if (foundGenres.size() != genres.size()) {
            throw new ResourceNotFoundException("Some genres were not found");
        }
        return foundGenres;
    }
}
