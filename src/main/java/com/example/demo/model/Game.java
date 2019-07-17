package com.example.demo.model;

import java.util.List;

public class Game {
//    private Canvas canvas;
    private List<Card> canvas;
    private List<Player> players;

    public Game(){}

//    public Game(Canvas canvas, List<Player> players) {
//        this.canvas = canvas;
//        this.players = players;
//    }

    public Game(List<Card> canvas, List<Player> players) {
        this.canvas = canvas;
        this.players = players;
    }

    public List<Card> getCanvas() {
        return canvas;
    }

    public void setCanvas(List<Card> canvas) {
        this.canvas = canvas;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public String comparePlayers (List<Player> players) {

        String name = "";
        Card highestCard = new Card((short)0,"purple");

        for(Player player : players) {
            if (player.getHighest().compareTo(highestCard)>0) {
                name = player.getName();
                highestCard = player.getHighest();
            }
        }
        return name;
    }
}
