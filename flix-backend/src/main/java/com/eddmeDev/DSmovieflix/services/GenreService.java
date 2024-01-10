package com.eddmeDev.DSmovieflix.services;

import java.util.List;
import java.util.stream.Collectors;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eddmeDev.DSmovieflix.dto.GenreDTO;
import com.eddmeDev.DSmovieflix.entities.Genre;
import com.eddmeDev.DSmovieflix.repositories.GenreRepository;

@Service
public class GenreService {
	
	@Autowired
	private GenreRepository repository;

	@Transactional(readOnly = true)
	public List<GenreDTO> findAll(){
		List<Genre> list = repository.findAll();
		return list.stream().map(x -> new GenreDTO(x)).collect(Collectors.toList());
	}

	public GenreDTO findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
}
