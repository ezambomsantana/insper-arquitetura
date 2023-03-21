package com.insper.partida.game;

import com.insper.partida.equipe.Team;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String identifier;

    private Integer scoreHome;

    private Integer scoreAway;

    @ManyToOne
    @JoinColumn(name = "id_home")
    private Team home;

    @ManyToOne
    @JoinColumn(name = "id_away")
    private Team away;

    private Integer attendance;

    private LocalDateTime gameDate;

    private String status;

}
