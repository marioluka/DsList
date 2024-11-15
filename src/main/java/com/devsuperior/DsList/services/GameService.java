package com.devsuperior.DsList.services;

import com.devsuperior.DsList.dto.GameMinDTO;
import com.devsuperior.DsList.entities.Game;
import com.devsuperior.DsList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> resultado = gameRepository.findAll();
        return resultado.stream().map(GameMinDTO::new).toList();
    }
}
