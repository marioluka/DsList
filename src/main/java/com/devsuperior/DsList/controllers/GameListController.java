package com.devsuperior.DsList.controllers;

import com.devsuperior.DsList.dto.GameListDTO;
import com.devsuperior.DsList.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//Mapeando o controlador da api
@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    //Conectando ao serviço
    @Autowired
    private GameListService gameListService;

    //Retornando uma lista de DTO's dos jogos resumidos
    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }
}
