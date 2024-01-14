package com.example.datamovieflix.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.datamovieflix.entities.User;
import com.example.datamovieflix.repositories.UserRepository;
import com.example.datamovieflix.services.exceptions.UnauthorizedException;

@Service
public class AuthService {

	@Autowired
	private UserRepository userRepository;
	
	@Transactional(readOnly = true)
	public User authenticated() {
		 try {
	            String username = SecurityContextHolder.getContext().getAuthentication().getName();
	            return userRepository.findByEmail(username);
	        }
	        catch (Exception e) {
	            throw new UnauthorizedException("Invalid user");
	        }
	}
}

