package com.dslist.games.services;

import com.dslist.games.dto.GameMinDTO;
import com.dslist.games.entities.Game;
import com.dslist.games.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;  // injecao de dependencia

    public List<GameMinDTO> findAll() {
        List<Game> games = gameRepository.findAll();
        List<GameMinDTO> gameDTO = games.stream().map(GameMinDTO::new).toList();
        return gameDTO;
    }

}
