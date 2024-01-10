package com.eddmeDev.DSmovieflix.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eddmeDev.DSmovieflix.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

}
