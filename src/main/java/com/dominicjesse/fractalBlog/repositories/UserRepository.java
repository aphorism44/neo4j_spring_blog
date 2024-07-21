package com.dominicjesse.fractalBlog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.dominicjesse.fractalBlog.models.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
}