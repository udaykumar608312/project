package com.project.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.springboot.entity.Users;


@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
	

}
