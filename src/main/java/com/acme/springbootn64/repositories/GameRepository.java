package com.acme.springbootn64.repositories;

import com.acme.springbootn64.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
