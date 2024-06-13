package kr.sparta.movieinfo.info.model;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.LocalDate;

@Entity
@Table(name = "movie_info")
@Getter
public class MovieInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String originalTitle;

    @Column
    private Integer year;

    @Column
    private String country;

    @Column
    private String ageRatings;

    @Column
    private String genre;

    @Column
    private Integer runtime;

    @Column
    private LocalDate releaseDate;

    @Column
    private String director;

    @Column
    private String description;

    @Column
    private String actors;
}
