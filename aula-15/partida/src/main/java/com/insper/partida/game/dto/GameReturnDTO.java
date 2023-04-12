package com.insper.partida.game.dto;

import com.insper.partida.equipe.dto.TeamReturnDTO;
import com.insper.partida.game.Game;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class GameReturnDTO {

    private String identifier;
    private Integer scoreHome;
    private Integer scoreAway;
    private Integer attendance;
    private LocalDateTime gameDate;
    private String status;

    private TeamReturnDTO home;
    private TeamReturnDTO away;

    public static GameReturnDTO covert(Game game) {
        GameReturnDTO gameReturnDTO = new GameReturnDTO();
        gameReturnDTO.setIdentifier(game.getIdentifier());
        gameReturnDTO.setGameDate(game.getGameDate());
        gameReturnDTO.setAttendance(game.getAttendance());
        gameReturnDTO.setStatus(game.getStatus());
        gameReturnDTO.setScoreAway(game.getScoreAway());
        gameReturnDTO.setScoreHome(game.getScoreHome());
        gameReturnDTO.setHome(TeamReturnDTO.covert(game.getHome()));
        gameReturnDTO.setAway(TeamReturnDTO.covert(game.getAway()));
        return gameReturnDTO;
    }

}
