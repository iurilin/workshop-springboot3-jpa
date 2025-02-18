package com.iuritest.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iuritest.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
