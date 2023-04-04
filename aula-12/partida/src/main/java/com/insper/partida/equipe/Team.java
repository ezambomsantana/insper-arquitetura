package com.insper.partida.equipe;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.insper.partida.game.Game;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.File;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
@EqualsAndHashCode
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer id;

    private String identifier;

    private String name;

    private String stadium;

    @JsonIgnore
    @OneToMany(mappedBy = "away")
    private List<Game> away;

    @JsonIgnore
    @OneToMany(mappedBy = "home")
    private List<Game> home;
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(id, team.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

 */
}
