package com.example.rating.ratingservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.rating.ratingservice.pojo.Rating;
import com.example.rating.ratingservice.service.RatingService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/rating-api")
@Slf4j
public class RatingController {

	@Autowired
	private RatingService ratingService;

	@PostMapping("/saveRating")
	public ResponseEntity<Rating> createRating(@RequestBody Rating rating) {

		log.info("This is post createRating method");
		Rating ratingObj = ratingService.createRating(rating);
		

		return ResponseEntity.status(HttpStatus.CREATED).body(ratingObj);

	}

	@GetMapping("/getAllRating")
	public ResponseEntity<List<Rating>> getRating() {

		List<Rating> ratingObj = ratingService.getAllRating();

		return ResponseEntity.status(HttpStatus.OK).body(ratingObj);

	}

	@GetMapping("/user/{userId}")
	public ResponseEntity<List<Rating>> getRatingByID(@PathVariable(name = "userId") String userID) {

		List<Rating> ratingObj = ratingService.getRatingByUserId(userID);

		return ResponseEntity.status(HttpStatus.OK).body(ratingObj);

	}

	@GetMapping("/hotels/{hotelId}")
	public ResponseEntity<List<Rating>> getRatingByhotelID(@PathVariable(name = "hotelId") String hotelId) {

		List<Rating> ratingObj = ratingService.getRatingByHotelId(hotelId);

		return ResponseEntity.status(HttpStatus.OK).body(ratingObj);

	}

}
