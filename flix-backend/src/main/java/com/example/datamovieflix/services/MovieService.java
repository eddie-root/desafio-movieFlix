package com.example.datamovieflix.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.datamovieflix.dto.MovieDTO;
import com.example.datamovieflix.dto.ReviewDTO;
import com.example.datamovieflix.entities.Genre;
import com.example.datamovieflix.entities.Movie;
import com.example.datamovieflix.entities.Review;
import com.example.datamovieflix.repositories.GenreRepository;
import com.example.datamovieflix.repositories.MovieRepository;
import com.example.datamovieflix.repositories.ReviewRepository;

@Service
public class MovieService {
	
	@Autowired
	private GenreRepository genreRepository;
	
	@Autowired
	private MovieRepository movieRepository;
	
	@Autowired
	private ReviewRepository reviewRepository;

	@Transactional(readOnly = true)
	public Page<MovieDTO> findAllPageMovieByGenre(Long genreId, Pageable pageable) {
		Genre genre = (genreId == 0) ? null : genreRepository.getReferenceById(genreId);
		Page<Movie> moviePage = movieRepository.findMovieByGenre(genre, pageable);
		return moviePage.map(x -> new MovieDTO(x));
	}

	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {
		Optional<Movie> movie = movieRepository.findById(id);
		Movie movieObj = movie.orElseThrow();
		return new MovieDTO(movieObj);
	}
	
	@Transactional(readOnly = true)
	public List<ReviewDTO> findByReviewMovieId(Long idMovie){
		List<Review> reviews = reviewRepository.findByReviewMovieId(idMovie);
		return reviews.stream().map(x -> new ReviewDTO(x)).collect(Collectors.toList());
	}
}
