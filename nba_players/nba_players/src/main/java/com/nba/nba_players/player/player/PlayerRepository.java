package com.nba.nba_players.player.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository extends JpaRepository<player, String> {

    void deleteByName(String playerName);
    Optional<player> findByName(String playerName);
}
