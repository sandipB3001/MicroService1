package com.sandip.moviecatalogservice.service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sandip.moviecatalogservice.model.CatalogItem;
import com.sandip.moviecatalogservice.model.Movie;
import com.sandip.moviecatalogservice.model.Rating;

@Service
public class MovieCatalogServiceImpl implements MovieCatalogService{

	@Autowired
	private RestTemplate restTemplate;
	@Override
	public List<CatalogItem> getMovieCatalog(String userId) {
		//get all rated movie ids
		
		//for each movie id, call movie info service and get details
		
		//put them all together
		List<Rating> ratings=Arrays.asList(
				new Rating("1234",4),
				new Rating("5678",5)
				);
		//RestTemplate restTemplate=new RestTemplate();	//THIS RESTTEMPLATE IS USED FOR HITTING THE MOVIEINFO URL AND UNMARSHAL IT INTO MOVIE OBJECT
		return ratings.stream().map(rating->{
		Movie movie = restTemplate.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);	
		return new CatalogItem(movie.getName(),"Test",rating.getRating());
		})
		.collect(Collectors.toList());
		/*return Collections.singletonList(
				new CatalogItem("3 Idiots","Test",5)	
			);*/
	}

}
