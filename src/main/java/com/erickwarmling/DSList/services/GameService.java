package com.erickwarmling.DSList.services;

import com.erickwarmling.DSList.dto.GameMinDTO;
import com.erickwarmling.DSList.entities.Game;
import com.erickwarmling.DSList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
