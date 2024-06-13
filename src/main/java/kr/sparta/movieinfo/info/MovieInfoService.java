package kr.sparta.movieinfo.info;

import kr.sparta.movieinfo.info.dto.MovieInfoDto;
import kr.sparta.movieinfo.info.model.MovieInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieInfoService {
    private final MovieInfoRepository movieInfoRepository;

    public MovieInfoService(MovieInfoRepository movieInfoRepository) {
        this.movieInfoRepository = movieInfoRepository;
    }

    public List<MovieInfoDto> getMovieInfoList() {
        final List<MovieInfo> movies = movieInfoRepository.findAll();

        return movies.stream()
                .map(MovieInfoDto::new)
                .toList();
    }

    public MovieInfoDto getMovieInfo(Long movieNo) {
        return movieInfoRepository.findById(movieNo)
                .map(MovieInfoDto::new)
                .orElseThrow(() -> new IllegalArgumentException("No data found {movieNo: " + movieNo + "}"));
    }
}
