package com.sandip.ratingsdataservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rating")
public class RatingC {

	@GetMapping("/aaaa/{name}")
	public String ratingController(@PathVariable String name) {
		return name;
	}
}
