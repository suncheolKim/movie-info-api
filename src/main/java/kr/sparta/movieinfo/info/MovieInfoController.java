package kr.sparta.movieinfo.info;

import kr.sparta.movieinfo.info.dto.MovieInfoDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class MovieInfoController {
    private final MovieInfoService movieInfoService;

    public MovieInfoController(MovieInfoService movieInfoService) {
        this.movieInfoService = movieInfoService;
    }

    @GetMapping("/movies")
    public List<MovieInfoDto> getAllMovies() {
        return movieInfoService.getMovieInfoList();
    }

    @GetMapping("/movies/{movieNo}")
    public MovieInfoDto getMovieInfo(@PathVariable Long movieNo) {
        return movieInfoService.getMovieInfo(movieNo);
    }
}
