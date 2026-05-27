package com.steam.Mappers;

import java.util.ArrayList;
import java.util.List;

import com.steam.dto.GameDtoResponse;
import com.steam.dto.UserDto;
import com.steam.dto.UserDtoResponse;
import com.steam.dto.UserDtoResponseWithLibrary;
import com.steam.entity.Game;
import com.steam.entity.User;

public class Mapper {
    
    public static GameDtoResponse GametoDto(Game game){
        GameDtoResponse dto=new GameDtoResponse();
        dto.setId(game.getId());
        dto.setName(game.getName());
        dto.setPrice(game.getPrice());
        return dto;
    }
    public static UserDtoResponse UserToDto(User user){
        UserDtoResponse dto=new UserDtoResponse();
        dto.setId(user.getId());
        dto.setName(user.getName());
        return dto;
    }
    public static UserDtoResponseWithLibrary UserToDtoDetails(User user,List<GameDtoResponse> listaJuegos){
        UserDtoResponseWithLibrary dto=new UserDtoResponseWithLibrary();
        dto.setId(user.getId());
        dto.setName(user.getName());
        if(listaJuegos != null){
            dto.setLista(listaJuegos);
        }else{
            
            dto.setLista(new ArrayList<GameDtoResponse>());
        }
        
        return dto;
    }
    public static User dtoToUser(UserDto dto) {
       User nuevo=new User();
       nuevo.setName(dto.getName());
       return nuevo;
    }
}
