package com.erickwarmling.DSList.repositories;

import com.erickwarmling.DSList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
