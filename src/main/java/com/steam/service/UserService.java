package com.steam.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.steam.Mappers.Mapper;
import com.steam.dto.GameDtoResponse;
import com.steam.dto.UserDto;
import com.steam.dto.UserDtoResponse;
import com.steam.dto.UserDtoResponseWithLibrary;
import com.steam.entity.User;
import com.steam.repository.UserRepository;

@Service
public class UserService {
    
    private UserRepository userRepository;
    private LibraryService libraryService;
    public UserService(UserRepository userRepository,LibraryService libraryService) {
        this.userRepository = userRepository;
        this.libraryService=libraryService;
    }

    public List<UserDtoResponse> getAll() {
        List<User>lista= userRepository.findAll();
        List<UserDtoResponse>listaDto=new ArrayList<>();
        for(User u:lista){
            listaDto.add(Mapper.UserToDto(u));
        }
        return listaDto;
    }
    public UserDtoResponse getDtoById(Long id) {
        Optional<User> op= userRepository.findById(id);
               if(!op.isPresent()){
                  throw new RuntimeException("Usuario con id " + id + " no encontrado");
               }
            return Mapper.UserToDto(op.get());
    }
    public User getById(Long id) {
        Optional<User> op= userRepository.findById(id);
               if(!op.isPresent()){
                  throw new RuntimeException("Usuario con id " + id + " no encontrado");
               }
            return op.get();
    }

    public UserDtoResponse create(UserDto dto) {
        //falta validar si existe
        User nuevo=Mapper.dtoToUser(dto);
        return Mapper.UserToDto(userRepository.save(nuevo));
    }
    public UserDtoResponse update(Long id, UserDto dto) {
        Optional<User> op = userRepository.findById(id);
        if(!op.isPresent()){
            throw new RuntimeException("Usuario con id " + id + " no encontrado");
        }
        User user=op.get();
        if (dto.getName() != null) {
            user.setName(dto.getName());
        }

        return Mapper.UserToDto(userRepository.save(user));
    }
    public  UserDtoResponse delete(Long id) {
        //hacerlo logico mas adelante activado/desactivado
        Optional<User> op = userRepository.findById(id);
        if(!op.isPresent()){
           throw new RuntimeException("Usuario con id " + id + " no encontrado");
        }
        User user=op.get();
        userRepository.delete(user);
        return Mapper.UserToDto(user);
    }

     public UserDtoResponseWithLibrary getUserWithDetails(Long id){
        Optional<User> op = userRepository.findById(id);
        if(!op.isPresent()){
           throw new RuntimeException("Usuario con id " + id + " no encontrado");
        }
        User user=op.get();
        List<GameDtoResponse> listaJuegos=libraryService.getUserLibraryById(id);
        return Mapper.UserToDtoDetails(user, listaJuegos);
     }
}
