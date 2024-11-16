package com.devsuperior.DsList.dto;

import com.devsuperior.DsList.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(){
    }

    //Construtor utilizando a entidade da lista de jogos
    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    //Somente Getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
