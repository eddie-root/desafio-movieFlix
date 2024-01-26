package com.example.datamovieflix.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.datamovieflix.dto.GenreDTO;
import com.example.datamovieflix.services.GenreService;

@Controller
@RequestMapping("/genres")
public class GenreController {
	
	@Autowired
	private GenreService genreService;

	@GetMapping
	public ResponseEntity<List<GenreDTO>> findAll(){
		List<GenreDTO> list = genreService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<GenreDTO> findById(@PathVariable Long id){
		GenreDTO genreDto = genreService.findById(id);
		return ResponseEntity.ok().body(genreDto);
	}
}
