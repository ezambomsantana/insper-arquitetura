package com.insper.partida.game;

import com.insper.partida.equipe.Team;
import com.insper.partida.equipe.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private TeamService teamService;

    public List<Game> listGames() {
        return gameRepository.findAll();
    }

    public Game saveGame(Game game) {

        Team teamM = teamService.getTeam(game.getHome().getIdentifier());
        Team teamV = teamService.getTeam(game.getAway().getIdentifier());

        if (teamM == null || teamV == null) {
            return null;
        }

        game.setIdentifier(UUID.randomUUID().toString());
        game.setHome(teamM);
        game.setAway(teamV);
        game.setAttendance(0);
        game.setScoreHome(0);
        game.setScoreAway(0);
        game.setGameDate(LocalDateTime.now());
        game.setStatus("SCHEDULED");

        return gameRepository.save(game);
    }

    public Game editGame(String identifier, Game game) {
        Game gameBD = gameRepository.findByIdentifier(identifier);

        gameBD.setScoreAway(game.getScoreAway());
        gameBD.setScoreHome(game.getScoreHome());
        gameBD.setAttendance(game.getAttendance());
        gameBD.setStatus("FINISHED");

        return gameRepository.save(gameBD);
    }

    public void deleteGame(String identifier) {
        Game gameBD = gameRepository.findByIdentifier(identifier);
        if (gameBD != null) {
            gameRepository.delete(gameBD);
        }
    }
}
