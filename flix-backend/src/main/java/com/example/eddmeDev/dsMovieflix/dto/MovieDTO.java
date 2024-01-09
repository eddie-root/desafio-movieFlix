package com.example.eddmeDev.dsMovieflix.dto;

import java.io.Serializable;

import com.example.eddmeDev.dsMovieflix.entities.Movie;


public class MovieDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private String subTitle;
	private String imgUrl;
	private String synopsis;
	private Integer year;
	
	public MovieDTO() {
	}
	
	public MovieDTO(Long id, String title, String subTitle, String imgUrl, String synopsis, Integer year) {
		super();
		this.id = id;
		this.title = title;
		this.subTitle = subTitle;
		this.imgUrl = imgUrl;
		this.synopsis = synopsis;
		this.year = year;
	}
	
	public MovieDTO(Movie entity) {
		id = entity.getId();
		title = entity.getTitle();
		subTitle = entity.getSubTitle();
		imgUrl = entity.getImgUrl();
		synopsis = entity.getSynopsis();
		year = entity.getYear();
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

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
	
	
	
}
