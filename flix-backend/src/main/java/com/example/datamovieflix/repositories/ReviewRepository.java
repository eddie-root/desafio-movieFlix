package com.example.datamovieflix.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.datamovieflix.entities.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long>{

	@Query ("SELECT r FROM Review r " +
			"WHERE r.movie.id = :movieId " )
	List<Review> findByReviewMovieId(@Param("movieId") Long movieId);
	
}
