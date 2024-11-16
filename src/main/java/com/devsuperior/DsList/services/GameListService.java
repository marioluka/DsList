package com.devsuperior.DsList.services;

import com.devsuperior.DsList.dto.GameListDTO;
import com.devsuperior.DsList.entities.GameList;
import com.devsuperior.DsList.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class GameListService {

    //Conexão entre repositorio e serviço
    @Autowired
    private GameListRepository gameListRepository;

    // Retornando uma lista de DTO's resumidos dos jogos
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> resultado = gameListRepository.findAll();
        return resultado.stream().map(GameListDTO::new).toList();
    }
}
