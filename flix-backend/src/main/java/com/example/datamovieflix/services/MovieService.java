package com.example.datamovieflix.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.datamovieflix.dto.MovieDTO;
import com.example.datamovieflix.entities.Movie;
import com.example.datamovieflix.repositories.MovieRepository;



@Service
public class MovieService {
	
	@Autowired
	private MovieRepository movieRepository;

	@Transactional(readOnly = true)
	public MovieDTO findById(Long id) {
		Optional<Movie> obj = movieRepository.findById(id);
		Movie movie = obj.orElseThrow();
		return new MovieDTO(movie);
	}

	 
}
