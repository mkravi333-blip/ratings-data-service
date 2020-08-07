package com.movies.ratingsdataservice.controller;

import com.movies.ratingsdataservice.model.Rating;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/ratingsdata", produces = {MediaType.APPLICATION_JSON_VALUE})
public class RatingsDataController {

    @GetMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") int movieId){
        return new Rating(1, 5);
    }
}
