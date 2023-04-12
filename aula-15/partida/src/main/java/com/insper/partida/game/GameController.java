package com.insper.partida.game;

import com.insper.partida.game.dto.EditGameDTO;
import com.insper.partida.game.dto.GameReturnDTO;
import com.insper.partida.game.dto.SaveGameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public Page<GameReturnDTO> listGames(@RequestParam(required = false) String home,
                                @RequestParam(required = false) String away,
                                @RequestParam(required = false) Integer attendance,
                                Pageable pageable) {
        return gameService.listGames(home, away, attendance, pageable);
    }

    @PostMapping
    public GameReturnDTO saveGame(@RequestBody SaveGameDTO game) {
        return gameService.saveGame(game);
    }


    @GetMapping("/{identifier}")
    public GameReturnDTO getGame(@PathVariable String identifier) {
        return gameService.getGame(identifier);
    }

    @PostMapping("/{identifier}")
    public GameReturnDTO changeGame(@PathVariable String identifier, @RequestBody EditGameDTO game) {
        return gameService.editGame(identifier, game);
    }

    @DeleteMapping("/{identifier}")
    public void deleteGame(@PathVariable String identifier) {
        gameService.deleteGame(identifier);
    }

    @GetMapping("/{id}/score")
    public Integer getScoreTeam(@PathVariable String id) {
        return gameService.getScoreTeam(id);
    }

}
