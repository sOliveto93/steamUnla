package com.steam.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.steam.Mappers.Mapper;
import com.steam.dto.GameDtoResponse;
import com.steam.entity.Game;
import com.steam.repository.GameRepository;

@Service
public class GameService {
    
    private GameRepository gameRepository;

    public GameService (GameRepository gameRepository){
        this.gameRepository=gameRepository;
    }

    public List<GameDtoResponse> getAll(){
        List<Game>games= gameRepository.findAll();
        List<GameDtoResponse> listaDtos=new ArrayList<>();
        for(Game g:games){
            listaDtos.add(Mapper.GametoDto(g));
        }
        return listaDtos;
    }
    public GameDtoResponse getById(Long id){
        Optional<Game> game=gameRepository.findById(id);
        if(!game.isPresent()){
            throw new RuntimeException("el juego con id"+id+"no se encontro");
        }
        return Mapper.GametoDto(game.get());
    }
    public GameDtoResponse getByName(String name){
        Optional<Game> op =gameRepository.findByName(name);
        if(!op.isPresent()){
            throw new RuntimeException("el juego con nombre"+name+"no se encontro");
        }
        return Mapper.GametoDto(op.get());
    }
    public GameDtoResponse getByPrice(double price){
        Optional<Game> op= gameRepository.findByPrice(price);
        if(!op.isPresent()){
            throw new RuntimeException("no hay coincidencias exactas con ese precio");
        }
        return Mapper.GametoDto(op.get());
    }
    
}
