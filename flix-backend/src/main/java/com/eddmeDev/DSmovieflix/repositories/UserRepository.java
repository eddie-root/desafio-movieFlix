package com.eddmeDev.DSmovieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eddmeDev.DSmovieflix.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
