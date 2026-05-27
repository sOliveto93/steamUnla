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
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {

     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

    private String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL ,fetch = FetchType.LAZY)
    private List<Library> library = new ArrayList<>();

    public User() {
    }

    public User(Long id, String name, List<Library> library) {
        this.id = id;
        this.name = name;
        this.library = library;
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

    public List<Library> getLibrary() {
        return library;
    }

    public void setLibrary(List<Library> library) {
        this.library = library;
    }
    
    
}
