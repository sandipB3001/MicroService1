package com.sandip.ratingsdataservice.service;



import org.springframework.stereotype.Service;

import com.sandip.ratingsdataservice.model.Rating;



@Service
public class GetRatingServiceImpl implements GetRatingService{

	@Override
	public Rating getRatingService(String name) {
		// TODO Auto-generated method stub
		return new Rating(name,4);
	}

}
