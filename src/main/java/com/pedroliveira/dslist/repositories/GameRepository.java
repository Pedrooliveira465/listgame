package com.pedroliveira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroliveira.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
