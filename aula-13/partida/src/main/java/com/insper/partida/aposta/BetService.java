package com.insper.partida.aposta;

import com.insper.partida.game.Game;
import com.insper.partida.game.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BetService {

    @Autowired
    private BetRespository betRespository;

    @Autowired
    private GameService gameService;


    public Bet saveBet(Bet bet) {
        Game game = gameService.getGame(bet.getGame().getIdentifier());
        if (game == null) {
            throw new RuntimeException("Game not found");
        }

        bet.setGame(game);
        return betRespository.save(bet);

    }

    public List<Bet> listBets() {
        return null;
    }

    public Bet verifyBet(Integer betId) {
        return null;
    }

}
