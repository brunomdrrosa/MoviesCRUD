package com.brunomdrrosa.movieCRUD.controllers;

import com.brunomdrrosa.movieCRUD.entities.Movie;
import com.brunomdrrosa.movieCRUD.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/movies")
public class MovieController {

    @Autowired
    private MovieService service;

    @GetMapping
    public List<Movie> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Movie findById(@PathVariable Long id) {
        return service.findById(id);
    }

}
