package com.steam.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.steam.Mappers.Mapper;
import com.steam.dto.GameDtoResponse;
import com.steam.entity.Game;
import com.steam.entity.Library;
import com.steam.entity.User;
import com.steam.repository.GameRepository;
import com.steam.repository.LibraryRepository;
import com.steam.repository.UserRepository;

@Service
public class LibraryService {
    
    private final LibraryRepository libraryRepository;
    private final UserRepository userRepository;
    private final GameRepository gameRepository;
    
    public LibraryService(LibraryRepository libraryRepository,
                          UserRepository userRepository,
                          GameRepository gameRepository) {
        this.libraryRepository = libraryRepository;
        this.userRepository = userRepository;
        this.gameRepository = gameRepository;
    }

    public Library addGameToLibrary(Long userId, Long gameId) {

        if (userId == null || gameId == null) {
        throw new RuntimeException("userId y gameId no pueden ser null");
    }
        Optional<Library> existingLibrary = libraryRepository.findByUserIdAndGameId(userId, gameId);

        if (existingLibrary.isPresent()) {
            throw new RuntimeException("El juego ya está en la biblioteca");
        }

        Optional<User> op = userRepository.findById(userId);
         if(!op.isPresent()){
            throw new RuntimeException("usuario con id"+userId+" no encotrado");
         }   
         User user=op.get();
        Optional<Game> opGame = gameRepository.findById(gameId);
        if(!opGame.isPresent()){
            throw new RuntimeException("Juego con el id "+gameId+" no encontrado");
        }

        Library library = new Library();
        library.setUser(user);
        library.setGame(opGame.get());

        return libraryRepository.save(library);
    }
    public List<GameDtoResponse> getUserLibraryById(Long id){
        Optional<User> op = userRepository.findById(id);
         if(!op.isPresent()){
            throw new RuntimeException("usuario con id"+id+" no encotrado");
         }   
         User user=op.get();

        List<Library> library = libraryRepository.findByUserId(user.getId());

        List<GameDtoResponse> lista = new ArrayList<>();

        for (Library l : library) {
            lista.add(Mapper.GametoDto(l.getGame()));
        }

        return lista;
    }
}
