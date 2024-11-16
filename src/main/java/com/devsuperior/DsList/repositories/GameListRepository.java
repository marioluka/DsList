package com.devsuperior.DsList.repositories;

import com.devsuperior.DsList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface do repositorio para acessar o BD via tipo GameList e seus IDs
public interface GameListRepository extends JpaRepository<GameList, Long> {

}
