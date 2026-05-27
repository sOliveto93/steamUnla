package com.steam.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.steam.dto.GameDtoResponse;
import com.steam.service.LibraryService;

@RestController
@RequestMapping("/library")
public class LibraryController {
    
    private LibraryService libraryService;

    public LibraryController(LibraryService libraryService){
        this.libraryService=libraryService;
    }
@GetMapping("/{id}")
    public List<GameDtoResponse> getAll(@PathVariable Long id){
        return libraryService.getUserLibraryById(id);
    }
}
