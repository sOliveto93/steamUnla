package com.steam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.steam.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

    
} 
