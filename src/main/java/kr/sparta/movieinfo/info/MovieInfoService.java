package kr.sparta.movieinfo.info;

import kr.sparta.movieinfo.info.dto.MovieInfoDto;
import kr.sparta.movieinfo.info.model.MovieInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Service
public class MovieInfoService {
    private final MovieInfoRepository movieInfoRepository;

    public MovieInfoService(MovieInfoRepository movieInfoRepository) {
        this.movieInfoRepository = movieInfoRepository;
    }

    public List<MovieInfoDto> getMovieInfoList() {
        final List<MovieInfo> movies = movieInfoRepository.findAll();
        log.info(LocalDateTime.now().toString());
        return movies.stream()
                .map(MovieInfoDto::new)
                .toList();
    }

    public MovieInfoDto getMovieInfo(Long movieNo) {
        MovieInfoDto movieInfoDto = movieInfoRepository.findById(movieNo)
                .map(MovieInfoDto::new)
                .orElseThrow(() -> new IllegalArgumentException("No data found {movieNo: " + movieNo + "}"));
        log.info(LocalDateTime.now().toString());
        return movieInfoDto;
    }
}
