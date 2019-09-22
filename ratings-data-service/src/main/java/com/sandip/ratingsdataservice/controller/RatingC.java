package com.sandip.ratingsdataservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sandip.ratingsdataservice.model.Rating;
import com.sandip.ratingsdataservice.service.GetRatingService;

@RestController
@RequestMapping("/rating")
public class RatingC {
	
	@Autowired
	private GetRatingService getService;

	@GetMapping("/movierating/{name}")
	public Rating ratingController(@PathVariable String name) {
		return getService.getRatingService(name);
	}
}
