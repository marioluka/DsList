package com.devsuperior.DsList.repositories;

import com.devsuperior.DsList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

// Interface do repositorio para acessar o BD via tipo Game e seu ID
public interface GameRepository extends JpaRepository<Game, Long> {

}
