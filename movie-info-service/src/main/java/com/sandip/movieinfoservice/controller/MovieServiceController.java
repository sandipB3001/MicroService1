package com.sandip.movieinfoservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sandip.movieinfoservice.model.Movie;
import com.sandip.movieinfoservice.service.MovieService;



@RestController
@RequestMapping("/movies")
public class MovieServiceController {

	@Autowired
	private MovieService movieService;
	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable String movieId) {
		return movieService.getMovieService(movieId);
	}
}
