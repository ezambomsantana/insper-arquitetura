package com.insper.partida.equipe.dto;

import com.insper.partida.equipe.Team;
import com.insper.partida.game.Game;
import com.insper.partida.game.dto.GameReturnDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamReturnDTO {
    private String identifier;
    private String name;

    public static TeamReturnDTO covert(Team game) {
        TeamReturnDTO teamReturnDTO = new TeamReturnDTO();
        teamReturnDTO.setIdentifier(game.getIdentifier());
        teamReturnDTO.setName(game.getName());
        return teamReturnDTO;
    }
}
