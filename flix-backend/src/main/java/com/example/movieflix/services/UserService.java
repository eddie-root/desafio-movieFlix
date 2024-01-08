package com.example.movieflix.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.movieflix.dto.UserDTO;
import com.example.movieflix.entities.User;
import com.example.movieflix.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	@Transactional(readOnly = true)
	public UserDTO findById(Long id) {
		Optional<User> obj = repository.findById(id);
		User entity  = obj.orElseThrow();
		return new UserDTO(entity);
	}
	
}
