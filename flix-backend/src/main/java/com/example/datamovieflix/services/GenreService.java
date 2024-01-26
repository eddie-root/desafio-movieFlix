package com.example.datamovieflix.services;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.datamovieflix.dto.GenreDTO;
import com.example.datamovieflix.entities.Genre;
import com.example.datamovieflix.repositories.GenreRepository;



@Service
public class GenreService {
	
	@Autowired
	private GenreRepository genreRepository;
	
	@Transactional(readOnly = true)
//  @PreAuthorize("hasAnyRole('MEMBER','VISITOR')")
    public List<GenreDTO> findAll(){
        List<Genre> list = genreRepository.findAll();
        return list.stream().map(x -> new GenreDTO(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
//  @PreAuthorize("hasAnyRole('MEMBER','VISITOR')")
    public GenreDTO findById(Long id){
        Optional<Genre> categoryObj = genreRepository.findById(id);
        Genre client = categoryObj.orElseThrow();
        return new GenreDTO(client);
    }
}
