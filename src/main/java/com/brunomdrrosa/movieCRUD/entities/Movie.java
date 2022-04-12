package com.brunomdrrosa.movieCRUD.entities;

import javax.persistence.*;

@Entity
@Table(name="tb_movie")
public class Movie {

    @Id
    @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Integer year;
    private String poster;

    public Movie() {}

    public Movie(Long id, String title, Integer year, String poster) {
        this.id = id;
        this.title = title;
        this.year = year;
        this.poster = poster;
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
