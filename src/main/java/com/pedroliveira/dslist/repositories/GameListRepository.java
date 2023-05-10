package com.pedroliveira.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pedroliveira.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {
    
}
