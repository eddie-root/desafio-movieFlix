package com.example.datamovieflix.dto;

import com.example.datamovieflix.entities.Movie;

public class MovieDTO {

	private Long id;
    private String title;
    private String subTitle;
    private String imgUrl;
    private String synopsis;
    private Integer mYear;
    
    private GenreDTO genre;

	public MovieDTO() {
		super();
	}

	public MovieDTO(Long id, String title, String subTitle, String imgUrl, String synopsis, Integer mYear,
			GenreDTO genre) {
		super();
		this.id = id;
		this.title = title;
		this.subTitle = subTitle;
		this.imgUrl = imgUrl;
		this.synopsis = synopsis;
		this.mYear = mYear;
		this.genre = genre;
	}

	public MovieDTO(Movie movie) {
		this.id = movie.getId();
		this.title = movie.getTitle();
		this.subTitle = movie.getSubTitle();
		this.imgUrl = movie.getImgUrl();
		this.synopsis = movie.getSynopsis();
		this.mYear = movie.getmYear();
		this.genre = new GenreDTO(movie.getGenre());
	}
	
	public Movie toEntity() {
		return new Movie(
				this.title,
				this.subTitle,
				this.imgUrl,
				this.synopsis,
				this.mYear,
				this.genre == null ? null : this.genre.toEntity());
	}
	
	public void getMovieId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	
	public Integer getmYear() {
		return mYear;
	}

	public void setmYear(Integer mYear) {
		this.mYear = mYear;
	}

	public GenreDTO getGenre() {
		return genre;
	}

	public void setGenre(GenreDTO genre) {
		this.genre = genre;
	}
    
    
}
