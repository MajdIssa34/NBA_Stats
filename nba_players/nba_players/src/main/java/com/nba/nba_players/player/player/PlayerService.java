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

    public List<player> getPlayers(){
        return playerRepository.findAll();
    }

    public List<player> getPlayerFromTeam(String team){
        return playerRepository.findAll().stream()
                .filter(player -> team.equals(player.getTeam()))
                .collect(Collectors.toList());
    }
    public List<player> getPlayerByName(String name){
        return playerRepository.findAll().stream()
                .filter(player -> player.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }
    public List<player> getPlayerByPos(String position){
        return playerRepository.findAll().stream()
                .filter(player -> player.getPosition().toLowerCase().contains(position.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<player> getPlayersByAge(Double age){
        return playerRepository.findAll().stream()
                .filter(player -> player.getAge().equals(age))
                .toList();
    }

    public List<player> getPlayerByPointsAverage(Double average){
        return playerRepository.findAll().stream()
                .filter(player -> player.getPpg() >= average)
                .toList();
    }

    public List<player> getPlayerByTeamAndPosition(String team, String position){
        return playerRepository.findAll().stream()
                .filter(player -> (player.getTeam().equals(team) && player.getPosition().equals(position)))
                .toList();
    }

}
