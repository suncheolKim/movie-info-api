package kr.sparta.movieinfo.info;

import kr.sparta.movieinfo.info.model.MovieInfo;
import org.springframework.web.bind.annotation.GetMapping;
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
    public List<MovieInfo> getMovieInfoList() {
        return movieInfoService.getMovieInfoList();
    }
}
