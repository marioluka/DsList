package com.devsuperior.DsList.services;

import com.devsuperior.DsList.dto.GameDTO;
import com.devsuperior.DsList.dto.GameMinDTO;
import com.devsuperior.DsList.entities.Game;
import com.devsuperior.DsList.projections.GameMinProjection;
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
    public GameDTO findById(Long Id){
        Game resultado = (Game)gameRepository.findById(Id).get();
        return new GameDTO(resultado);
    }

    // Retornando uma lista de DTO's resumidos dos jogos
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> resultado = gameRepository.findAll();
        return resultado.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> resultado = gameRepository.searchByList(listId);
        return resultado.stream().map(GameMinDTO::new).toList();
    }
}
