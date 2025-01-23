package com.erickwarmling.DSList.repositories;

import com.erickwarmling.DSList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
