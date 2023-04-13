package com.insper.partida.game;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GameService {

    public GameReturnDTO verifyGame(String identifier) {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<GameReturnDTO> response =
                restTemplate.getForEntity("http://localhost:8080/game/" + identifier, GameReturnDTO.class);
        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        }
        return null;
    }

}
