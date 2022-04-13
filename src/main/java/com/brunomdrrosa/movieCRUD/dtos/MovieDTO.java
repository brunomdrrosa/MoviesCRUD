package com.brunomdrrosa.movieCRUD.dtos;

import com.brunomdrrosa.movieCRUD.entities.Movie;

public class MovieDTO {
    private Long id;
    private String title;
    private Integer year;
    private String poster;

    public MovieDTO() {}

    public MovieDTO(Long id, String title, Integer year, String poster) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.poster = poster;
    }

    public MovieDTO(Movie movie) {
        id = movie.getId();
        title = movie.getTitle();
        year = movie.getYear();
        poster = movie.getPoster();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
