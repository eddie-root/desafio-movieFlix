package com.eddmeDev.DSmovieflix.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import com.eddmeDev.DSmovieflix.entities.Review;
import com.eddmeDev.DSmovieflix.entities.User;



public class ReviewDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    @NotBlank(message = "Preencha o campo para enviar a sua avaaliação.")
	private String text;
	private Long movieId;
	private UserDTO user;
	
	public ReviewDTO() {
	}
	
	public ReviewDTO(Review review) {
		id = review.getId();
		text = review.getText();
		movieId = review.getMovie().getId();
		user = new UserDTO(review.getUser());
	}
	
	public ReviewDTO(Review review, User user) {
		id = review.getId();
		text = review.getText();
		this.user = new UserDTO(user);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Long getMovieId() {
		return movieId;
	}

	public void setMovieId(Long movieId) {
		this.movieId = movieId;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}
	
		
}