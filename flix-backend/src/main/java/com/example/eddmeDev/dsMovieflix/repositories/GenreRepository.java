package com.example.eddmeDev.dsMovieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.eddmeDev.dsMovieflix.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}
