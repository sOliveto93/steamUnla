package com.steam.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steam.dto.UserDto;
import com.steam.dto.UserDtoResponse;
import com.steam.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
    private UserService userService;
    public UserController(UserService userService){
        this.userService=userService;
    }

    @GetMapping()
    public List<UserDtoResponse>getAll(){
        return userService.getAll();
    }
    @GetMapping("/{id}")
    public UserDtoResponse getById(@PathVariable Long id){
        return userService.getDtoById(id);
    }
    @PutMapping("/{id}")
    public UserDtoResponse updateUserById(@PathVariable Long id,@RequestBody UserDto dto){
        return userService.update(id, dto);
    }

    @PostMapping()
    public UserDtoResponse create(@RequestBody UserDto dto){
        return userService.create(dto);
    }

    @DeleteMapping("/{id}")
    public UserDtoResponse deleteUserById(@PathVariable Long id){
        return userService.delete(id);
    }
}

