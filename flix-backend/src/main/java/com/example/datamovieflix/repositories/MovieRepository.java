package com.example.datamovieflix.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.example.datamovieflix.entities.Genre;
import com.example.datamovieflix.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	@Query("SELECT DISTINCT obj FROM Movie obj " +
			"WHERE :genre IS NULL OR obj.genre = :genre " )
	Page<Movie> findMovieByGenre(Genre genre, Pageable pageable);
}
