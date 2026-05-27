package com.steam.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.steam.entity.Game;

public interface GameRepository extends JpaRepository<Game,Long>{
    public Optional<Game> findByName(String name);
    public Optional<Game> findByPrice(double price);
}
