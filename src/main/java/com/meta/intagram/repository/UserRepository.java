package com.meta.intagram.repository;

import com.meta.intagram.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{
	
}