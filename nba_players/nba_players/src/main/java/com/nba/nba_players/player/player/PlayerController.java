package com.nba.nba_players.player.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/player")
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    @GetMapping
    public List<player> getPlayers(
            @RequestParam(required = false) String team,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String position,
            @RequestParam(required = false) Double age,
            @RequestParam(required = false) Double average
    ) {
        if(team != null && position != null){
            return playerService.getPlayerByTeamAndPosition(team, position);
        }
        else if(team != null){
            return playerService.getPlayerFromTeam(team);
        }
        else if(name != null){
            return playerService.getPlayerByName(name);
        }
        else if(position != null){
            return playerService.getPlayerByPos(position);
        }
        else if(average != null){
            return playerService.getPlayerByPointsAverage(average);
        }
        else if(age != null){
            return playerService.getPlayersByAge(age);
        }
        else{
            return playerService.getPlayers();
        }
    }
}
