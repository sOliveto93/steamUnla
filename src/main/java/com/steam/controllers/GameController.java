package com.steam.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.steam.dto.GameDtoResponse;
import com.steam.service.GameService;
@RestController
@RequestMapping("/game")
public class GameController {
    
    private final GameService gameService;

    public GameController(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping
    public List<GameDtoResponse> getAll() {
        return gameService.getAll();
    }

    @GetMapping("/{id}")
    public GameDtoResponse getById(@PathVariable Long id) {
        return gameService.getById(id);
    }

    @GetMapping("/name")
    public GameDtoResponse getByName(@RequestParam String name) {
        return gameService.getByName(name);
    }

    @GetMapping("/price")
    public GameDtoResponse getByPrice(@RequestParam double price) {
        return gameService.getByPrice(price);
    }

    
}
