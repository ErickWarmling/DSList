package com.erickwarmling.DSList.services;

import com.erickwarmling.DSList.dto.GameDTO;
import com.erickwarmling.DSList.dto.GameListDTO;
import com.erickwarmling.DSList.dto.GameMinDTO;
import com.erickwarmling.DSList.entities.Game;
import com.erickwarmling.DSList.entities.GameList;
import com.erickwarmling.DSList.repositories.GameListRepository;
import com.erickwarmling.DSList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
