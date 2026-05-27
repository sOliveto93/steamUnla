package com.steam.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Library {
      @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

     @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private Game game;

    public Library() {
    }

    public Library(Long id, User user, Game game) {
      this.id = id;
      this.user = user;
      this.game = game;
    }

    public Long getId() {
      return id;
    }

    public void setId(Long id) {
      this.id = id;
    }

    public User getUser() {
      return user;
    }

    public void setUser(User user) {
      this.user = user;
    }

    public Game getGame() {
      return game;
    }

    public void setGame(Game game) {
      this.game = game;
    }
    

    
}
