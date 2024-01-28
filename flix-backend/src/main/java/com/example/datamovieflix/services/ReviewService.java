package com.example.datamovieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.datamovieflix.dto.ReviewDTO;
import com.example.datamovieflix.entities.Review;
import com.example.datamovieflix.repositories.MovieRepository;
import com.example.datamovieflix.repositories.ReviewRepository;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepository reviewRepository;
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Transactional
	public ReviewDTO saveReview(ReviewDTO reviewDTO) {
		
		Review newReview = new Review();
		newReview.setId(reviewDTO.getId());
		newReview.setText(reviewDTO.getText());
		newReview.setMovie(movieRepository.getReferenceById(reviewDTO.getMovieId()));
		reviewRepository.save(newReview);
		return new ReviewDTO(newReview);
	}
}
