package com.devsuperior.DsList.controllers;

import com.devsuperior.DsList.dto.GameListDTO;
import com.devsuperior.DsList.dto.GameMinDTO;
import com.devsuperior.DsList.dto.ReplacementDTO;
import com.devsuperior.DsList.services.GameListService;
import com.devsuperior.DsList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Mapeando o controlador da api
@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    //Conectando ao serviço
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    //Retornando uma lista de DTO's dos jogos resumidos
    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        return gameService.findByList(listId);
    }

    @PostMapping(value = "/{listId}/replacement")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body){
        gameListService.move(listId,body.getSourceIndex(), body.getDestinationIndex());
    }

}
