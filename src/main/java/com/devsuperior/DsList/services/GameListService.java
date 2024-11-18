package com.devsuperior.DsList.services;

import com.devsuperior.DsList.dto.GameListDTO;
import com.devsuperior.DsList.entities.GameList;
import com.devsuperior.DsList.projections.GameMinProjection;
import com.devsuperior.DsList.repositories.GameListRepository;
import com.devsuperior.DsList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class GameListService {

    //Conexão entre repositorio e serviço
    @Autowired
    private GameListRepository gameListRepository;

    @Autowired
    private GameRepository gameRepository;

    // Retornando uma lista de DTO's resumidos dos jogos
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> resultado = gameListRepository.findAll();
        return resultado.stream().map(GameListDTO::new).toList();
    }

    @Transactional
    public void move(Long listId, int sourceIndex, int destinationIndex){
        List<GameMinProjection> list = gameRepository.searchByList(listId);
        GameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

        for (int i = min; i<= max; i++){
            gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
        }
    }
}
