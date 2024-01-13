package com.example.datamovieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.datamovieflix.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
