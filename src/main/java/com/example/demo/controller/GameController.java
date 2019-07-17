package com.example.demo.controller;

import com.example.demo.model.Canvas;
import com.example.demo.model.Card;
import com.example.demo.model.Game;
import com.example.demo.model.Player;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class GameController {
    @PostMapping("/playAgame")
    public String addNewGame(@RequestBody Game newGame) {

        return newGame.comparePlayers(newGame.getPlayers());
    }
    @GetMapping("/playAgame")
    public Game getGame() {


        List<Card> cards = Arrays.asList(new Card((short)7, "yellow"), new Card((short)5, "red"));
//        Canvas canvas = new Canvas(cards);
        Player player1 = new Player("Ania", cards);
        Player player2 = new Player("Mira", cards);
        Game newGame = new Game(cards, Arrays.asList(player1));

        return newGame;
    }
}
