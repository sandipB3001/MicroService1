package com.sandip.ratingsdataservice.service;

import java.util.List;

import com.sandip.ratingsdataservice.model.Rating;

public interface GetRatingService {

	public Rating getRatingService(String name);

	public List<Rating> getUserRatings(String userId);
}
