package pl.mmazur.movieclub.domain.genre;

import org.springframework.stereotype.Service;
import pl.mmazur.movieclub.domain.genre.dto.GenreDto;

import java.util.Optional;
@Service
public class GenreService {
    private final GenreRepository genreRepository;

    public GenreService(GenreRepository genreRepository) {
        this.genreRepository = genreRepository;
    }

    public Optional<GenreDto> findGenreByName(String name) {
        return genreRepository.findByNameIgnoreCase(name)
                .map(GenreDtoMapper::map);
    }
}
