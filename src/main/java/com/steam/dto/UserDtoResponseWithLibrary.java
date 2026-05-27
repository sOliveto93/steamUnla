package com.steam.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDtoResponseWithLibrary {

    private Long id;
    private String name;
    private List<GameDtoResponse> lista=new ArrayList<>();
    
    public UserDtoResponseWithLibrary() {}

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
public List<GameDtoResponse> getLista() {
    return lista;
}
public void setLista(List<GameDtoResponse> lista) {
    this.lista = lista;
}


}
