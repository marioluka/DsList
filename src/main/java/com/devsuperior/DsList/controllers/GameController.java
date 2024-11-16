package com.devsuperior.DsList.controllers;

import com.devsuperior.DsList.dto.GameDTO;
import com.devsuperior.DsList.dto.GameMinDTO;
import com.devsuperior.DsList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Mapeando o controlador da api
@RestController
@RequestMapping(value = "/games")
public class GameController {

    //Conectando ao serviço
    @Autowired
    private GameService gameService;

    //Retornando uma lista de DTO's dos jogos resumidos
    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
         return gameService.findById(id);
    }
}
