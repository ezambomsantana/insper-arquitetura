package com.insper.partida.aposta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BetRespository extends JpaRepository<Bet, Integer> {
    List<Bet> findByGameIdentifier(String gameId);
}
