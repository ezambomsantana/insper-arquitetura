package com.insper.partida.aposta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BetService {

    @Autowired
    private BetRespository betRespository;


    public Bet saveBet(Bet bet) {
        return null;

    }

    public List<Bet> listBets() {
        return null;
    }

    public Bet verifyBet(Integer betId) {
        return null;
    }

}
