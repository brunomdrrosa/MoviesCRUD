package com.brunomdrrosa.movieCRUD.services;

import com.brunomdrrosa.movieCRUD.entities.Movie;
import com.brunomdrrosa.movieCRUD.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository repository;

    @Transactional(readOnly = true)
    public List<Movie> findAll() {
        return repository.findAll();
    }

    @Transactional(readOnly = true)
    public Movie findById(Long id) {
        return repository.findById(id).get();
    }

    @Transactional
    public Movie addMovie(Movie newMovie) {
        return repository.saveAndFlush(newMovie);
    }
}
