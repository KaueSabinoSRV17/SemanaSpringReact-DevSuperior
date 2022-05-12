package com.SemanaSpringReact.dsmovie.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SemanaSpringReact.dsmovie.DTO.MovieDTO;
import com.SemanaSpringReact.dsmovie.DTO.ScoreDTO;
import com.SemanaSpringReact.dsmovie.models.Movie;
import com.SemanaSpringReact.dsmovie.models.Score;
import com.SemanaSpringReact.dsmovie.models.User;
import com.SemanaSpringReact.dsmovie.repositories.MovieRepository;
import com.SemanaSpringReact.dsmovie.repositories.ScoreRepository;
import com.SemanaSpringReact.dsmovie.repositories.UserRepository;

@Service
public class ScoreService {

	@Autowired
	private MovieRepository mr;

	@Autowired
	private ScoreRepository sr;

	@Autowired
	private UserRepository ur;

	@Transactional (readOnly = true)	
	public MovieDTO saveScore(ScoreDTO dto) {
		
		User user = ur.findByEmail(dto.getEmail());
		
		if (user == null) {
			
			user = new User();
			user.setEmail(dto.getEmail());
			user = ur.saveAndFlush(user);
			
		}
		
		Movie movie = mr.findById(dto.getMovieId()).get();
		
		Score score = new Score();
		score.setMovie(movie);
		score.setUser(user);
		score.setValue(dto.getScore());
		
		score = sr.saveAndFlush(score);
		
		double sum = 0.0;
		
		for(Score s : movie.getScores()) {
			
			sum = sum + s.getValue();
			
		}
		
		double avg = sum / movie.getScores().size();
		
		movie.setScore(avg);
		movie.setCount(movie.getScores().size());
		
		movie = mr.save(movie);
		
		return new MovieDTO(movie);
		
	}
	
}
