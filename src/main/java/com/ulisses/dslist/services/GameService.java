package com.ulisses.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ulisses.dslist.dto.GameMinDTO;
import com.ulisses.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDTO> findAll() {
		return gameRepository.findAll().stream().map(x-> new GameMinDTO(x)).toList();
	}

}
