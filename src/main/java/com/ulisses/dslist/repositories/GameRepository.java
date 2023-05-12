package com.ulisses.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ulisses.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
