package com.example.datamovieflix.dto;

import com.example.datamovieflix.entities.Genre;

public class GenreDTO {

	private Long id;
    private String name;
    
	public GenreDTO() {
		super();
	}

	public GenreDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public GenreDTO(Genre genre) {
		id = genre.getId();
		name = genre.getName();
	}
	
	
	public Genre toEntity() {
		// TODO Auto-generated method stub
		return new Genre(this.id, this.name);
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

    
	
    
}
