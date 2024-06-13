package kr.sparta.movieinfo.info.dto;

import kr.sparta.movieinfo.info.model.MovieInfo;
import lombok.Getter;

import java.time.LocalDate;

@Getter
public class MovieInfoDto {
    private Long id;
    private String title;
    private String originalTitle;
    private Integer year;
    private String country;
    private String ageRatings;
    private String genre;
    private Integer runtime;
    private LocalDate releaseDate;
    private String director;
    private String description;
    private String actors;

    public MovieInfoDto(MovieInfo movieInfo) {
        this.id = movieInfo.getId();
        this.title = movieInfo.getTitle();
        this.originalTitle = movieInfo.getOriginalTitle();
        this.year = movieInfo.getYear();
        this.country = movieInfo.getCountry();
        this.ageRatings = movieInfo.getAgeRatings();
        this.genre = movieInfo.getGenre();
        this.runtime = movieInfo.getRuntime();
        this.releaseDate = movieInfo.getReleaseDate();
        this.director = movieInfo.getDirector();
        this.description = movieInfo.getDescription();
        this.actors = movieInfo.getActors();
    }
}
