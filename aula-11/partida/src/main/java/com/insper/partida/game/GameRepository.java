package com.insper.partida.game;

import com.insper.partida.equipe.Team;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {
    Game findByIdentifier(String identifier);

    Page<Game> findByHomeAndAway(Team tHome, Team tAway, Pageable pageable);

    Page<Game> findByAttendanceGreaterThan(Integer attendance, Pageable pageable);


    @Query("select sum(g.scoreHome) from Game g where g.home = ?1")
    public Integer sumScoreTeamHome(Team team);
}
