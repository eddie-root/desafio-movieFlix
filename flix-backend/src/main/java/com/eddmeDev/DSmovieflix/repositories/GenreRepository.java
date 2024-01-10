package com.eddmeDev.DSmovieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eddmeDev.DSmovieflix.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long>{

}
