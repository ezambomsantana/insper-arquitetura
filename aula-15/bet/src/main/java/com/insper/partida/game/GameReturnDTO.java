package com.insper.partida.game;

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



}
