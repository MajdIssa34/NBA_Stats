package com.nba.nba_players.player.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

    // Get all players
    public List<player> getPlayers(){
        return playerRepository.findAll();
    }

    public List<player> getPlayersByFilters(String team, String name, String position, Double age, Double average, Double threept) {
        return playerRepository.findAll().stream()
                .filter(player -> (team == null || player.getTeam().equalsIgnoreCase(team)))
                .filter(player -> (name == null || player.getName().toLowerCase().contains(name.toLowerCase())))
                .filter(player -> (position == null || player.getPos().equalsIgnoreCase(position)))
                .filter(player -> (age == null || player.getAge().equals(age)))
                .filter(player -> (average == null || player.getPpg() >= average))
                .filter(player -> (threept == null || player.getThreept() >= threept))
                .collect(Collectors.toList());
    }

}
