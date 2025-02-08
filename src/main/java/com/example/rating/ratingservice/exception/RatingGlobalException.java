package com.example.rating.ratingservice.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.rating.ratingservice.payload.ErrorResponse;

@ControllerAdvice
public class RatingGlobalException {

	@ExceptionHandler(ResourceNotFoundException.class)

	public ResponseEntity<ErrorResponse> getResourceNotfoundHandler(ResourceNotFoundException ex) {

		ErrorResponse response = ErrorResponse.builder().message(ex.getMessage()).success(false)
				.status(HttpStatus.NOT_FOUND).build();

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);

	}

}
