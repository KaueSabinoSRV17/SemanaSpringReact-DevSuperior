package com.SemanaSpringReact.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SemanaSpringReact.dsmovie.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

		User findByEmail(String email);

}
