package com.eddmeDev.DSmovieflix.dto;

import java.io.Serializable;

import com.eddmeDev.DSmovieflix.entities.Genre;

public class GenreDTO implements Serializable {
    private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	
	public GenreDTO() {
	}
	
	public GenreDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public GenreDTO(Genre genre) {
		this.id = genre.getId();
		this.name = genre.getName();
	}
	
	public Genre toEntity() {
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
