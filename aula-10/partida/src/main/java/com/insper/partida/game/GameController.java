package com.insper.partida.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<Game> listGames() {
        return gameService.listGames();
    }

    @PostMapping
    public Game saveGame(@RequestBody Game game) {
        return gameService.saveGame(game);
    }

    @PostMapping("/{identifier}")
    public Game changeGame(@PathVariable String identifier, @RequestBody Game game) {
        return gameService.editGame(identifier, game);
    }

    @DeleteMapping("/{identifier}")
    public void deleteGame(@PathVariable String identifier) {
        gameService.deleteGame(identifier);
    }

}
