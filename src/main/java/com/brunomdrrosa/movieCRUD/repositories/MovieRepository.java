package com.brunomdrrosa.movieCRUD.repositories;

import com.brunomdrrosa.movieCRUD.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findAll();
    void deleteById(Long Id);
}
