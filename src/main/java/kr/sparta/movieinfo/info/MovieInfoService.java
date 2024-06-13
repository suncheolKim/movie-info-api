package kr.sparta.movieinfo.info;

import kr.sparta.movieinfo.info.model.MovieInfo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieInfoService {
    private final MovieInfoRepository movieInfoRepository;

    public MovieInfoService(MovieInfoRepository movieInfoRepository) {
        this.movieInfoRepository = movieInfoRepository;
    }

    public List<MovieInfo> getMovieInfoList() {
        return movieInfoRepository.findAll();
    }
}
