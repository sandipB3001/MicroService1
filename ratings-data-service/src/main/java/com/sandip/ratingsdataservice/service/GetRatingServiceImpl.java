package com.sandip.ratingsdataservice.service;



import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sandip.ratingsdataservice.model.Rating;



@Service
public class GetRatingServiceImpl implements GetRatingService{

	@Override
	public Rating getRatingService(String name) {
		return new Rating(name,4);
	}

	@Override
	public List<Rating> getUserRatings(String userId) {
		List<Rating> ratings=Arrays.asList(
				new Rating("1234",4),
				new Rating("5678",7)
				);
		return ratings;
	}

}
