package com.insper.partida.aposta;

import com.insper.partida.game.GameReturnDTO;
import com.insper.partida.game.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@Service
public class BetService {

    @Autowired
    private BetRespository betRespository;

    @Autowired
    private GameService gameService;


    public Bet saveBet(Bet bet) {
        GameReturnDTO gameReturnDTO = gameService.verifyGame(bet.getGameIdentifier());
        if (gameReturnDTO != null) {
            return betRespository.save(bet);
        }
        throw new RuntimeException("Game not found");
    }

    public List<Bet> listBets() {
        return null;
    }

    public Bet verifyBet(Integer betId) {
        return null;
    }


    public List<Bet> getBetsByGame(String gameId) {

        GameReturnDTO game = gameService.verifyGame(gameId);
        if (game != null) {
            return betRespository.findByGameIdentifier(gameId);
        }
        throw new RuntimeException("Game not found");

    }
}
