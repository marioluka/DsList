package com.devsuperior.DsList.services;

import com.devsuperior.DsList.dto.GameDTO;
import com.devsuperior.DsList.dto.GameMinDTO;
import com.devsuperior.DsList.entities.Game;
import com.devsuperior.DsList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    //Conexão entre repositorio e serviço
    @Autowired
    private GameRepository gameRepository;

    //Buscando o jogo por Id e convertendo para DTO
    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    }

    // Retornando uma lista de DTO's resumidos dos jogos
    public List<GameMinDTO> findAll() {
        List<Game> resultado = gameRepository.findAll();
        return resultado.stream().map(GameMinDTO::new).toList();
    }
}
