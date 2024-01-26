package com.example.datamovieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.datamovieflix.entities.Genre;

@Repository
public interface GenreRepository extends JpaRepository<Genre, Long> {

}
