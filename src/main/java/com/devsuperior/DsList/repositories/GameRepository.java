package com.devsuperior.DsList.repositories;

import com.devsuperior.DsList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
