package com.example.rating.ratingservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.rating.ratingservice.pojo.Rating;
import java.util.List;


@Repository
public interface RatingRepo extends JpaRepository<Rating, String> {
	
	
	//customFinder method 
	List<Rating> findByHotelId(String hotelId);
	List<Rating> findByUserId(String userId);

}
