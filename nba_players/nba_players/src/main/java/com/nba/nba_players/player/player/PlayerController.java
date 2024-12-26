package com.nba.nba_players.player.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/player")
@CrossOrigin(origins = "http://localhost:8090") // Replace with your frontend's origin
public class PlayerController {

    private final PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    @GetMapping("/compare")
    public List<player> comparePlayers(@RequestParam List<String> playerNames) {
        if (playerNames.isEmpty() || playerNames.size() < 2) {
            throw new IllegalArgumentException("At least two player names must be provided for comparison.");
        }
        return playerService.comparePlayers(playerNames);
    }


    @GetMapping
    public List<player> getPlayers(
            @RequestParam(required = false) String team,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String position,
            @RequestParam(required = false) Double age,
            @RequestParam(required = false) Double average,
            @RequestParam(required = false) Double threept

    ) {
        return playerService.getPlayersByFilters(team, name, position, age, average, threept);
    }
}
