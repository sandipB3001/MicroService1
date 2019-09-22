package com.sandip.movieinfoservice.service;

import org.springframework.stereotype.Service;

import com.sandip.movieinfoservice.model.Movie;

@Service
public class MovieServiceImpl implements MovieService{

	@Override
	public Movie getMovieService(String movieId) {
		return new Movie(movieId,"Test Name");
	}

}
