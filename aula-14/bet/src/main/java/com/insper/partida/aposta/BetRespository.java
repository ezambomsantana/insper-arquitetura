package com.insper.partida.aposta;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BetRespository extends JpaRepository<Bet, Integer> {
}
