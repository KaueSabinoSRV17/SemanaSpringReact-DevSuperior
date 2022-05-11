package com.SemanaSpringReact.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SemanaSpringReact.dsmovie.models.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

		

}
