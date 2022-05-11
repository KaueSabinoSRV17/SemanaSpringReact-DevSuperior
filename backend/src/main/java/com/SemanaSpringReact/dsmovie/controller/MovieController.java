package com.SemanaSpringReact.dsmovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SemanaSpringReact.dsmovie.DTO.MovieDTO;
import com.SemanaSpringReact.dsmovie.services.MovieService;

@RestController
@RequestMapping(value = "/movies")
public class MovieController {
	
	@Autowired
	private MovieService ms;
	
	@GetMapping
	public Page<MovieDTO> findAll(Pageable pageable) {
		return ms.findAll(pageable);
	}

}
