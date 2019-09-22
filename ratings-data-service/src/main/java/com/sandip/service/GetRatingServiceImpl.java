package com.sandip.service;



import org.springframework.stereotype.Service;

import com.sandip.model.Rating;

@Service
public class GetRatingServiceImpl implements GetRatingService{

	@Override
	public Rating getRatingService(String name) {
		// TODO Auto-generated method stub
		return new Rating("name",4);
	}

}
