package com.steam.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Game {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String genre;
    private double price;

     @OneToMany(mappedBy = "game", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Library> owners = new ArrayList<>();
    
    public Game() {
    }
    
    public Game(Long id, String name, String genre, double price, List<Library> owners) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.price = price;
        this.owners = owners;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public List<Library> getOwners() {
        return owners;
    }

    public void setOwners(List<Library> owners) {
        this.owners = owners;
    }
    
}
