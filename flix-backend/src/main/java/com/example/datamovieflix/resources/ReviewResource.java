package com.example.datamovieflix.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.datamovieflix.dto.ReviewDTO;
import com.example.datamovieflix.services.ReviewService;

import jakarta.validation.Valid;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/reviews")
public class ReviewResource {
	
	@Autowired
	private ReviewService reviewService;

	
	@PostMapping
	public ResponseEntity<ReviewDTO> newReview(@Valid @RequestBody ReviewDTO dto) {
		dto = reviewService.saveReview(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
}
