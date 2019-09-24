package com.sandip.moviecatalogservice.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sandip.moviecatalogservice.model.CatalogItem;
import com.sandip.moviecatalogservice.model.Movie;
import com.sandip.moviecatalogservice.model.Rating;
import com.sandip.moviecatalogservice.service.MovieCatalogService;



@RestController
@RequestMapping(value="/catalog")
public class MovieCatalogController {

	@Autowired
	private MovieCatalogService movieCatalogService;
	@GetMapping(value="/{userId}")
	public List<CatalogItem> getCatalog(@PathVariable String userId)
	{		
		return movieCatalogService.getMovieCatalog(userId);
	}
}
