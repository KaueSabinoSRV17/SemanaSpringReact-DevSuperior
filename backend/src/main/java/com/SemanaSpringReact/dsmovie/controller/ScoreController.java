package com.SemanaSpringReact.dsmovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SemanaSpringReact.dsmovie.DTO.MovieDTO;
import com.SemanaSpringReact.dsmovie.DTO.ScoreDTO;
import com.SemanaSpringReact.dsmovie.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	
	@Autowired
	private ScoreService ss;
	
	@PutMapping
	@Transactional(readOnly = false)
	public MovieDTO SaveScroe(@RequestBody ScoreDTO dto) {
		MovieDTO movieDTO = ss.saveScore(dto);
		return movieDTO;
	}

}
