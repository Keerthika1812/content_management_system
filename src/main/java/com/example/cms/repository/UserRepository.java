package com.example.cms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cms.model.User;

import java.util.Optional;


@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	boolean existsByEmail(String email);
	
	public Optional<User> findByEmail(String email);
	
}
