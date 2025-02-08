package com.example.rating.ratingservice.service;

import java.util.List;

import com.example.rating.ratingservice.pojo.Rating;

public interface RatingService {
	
	
	public Rating createRating(Rating ratingReq);
	public List<Rating> getAllRating();
	public List<Rating> getRatingByUserId(String userId);
	public List<Rating> getRatingByHotelId(String hotelId);

}
