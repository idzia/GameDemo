package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Collections;
import java.util.List;

public class Player {
    private String name;
    private List<Card> palette;

    public Player() {
    }

    public Player(String name, List<Card> palette) {
        this.name = name;
        this.palette = palette;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Card> getPalette() {
        return palette;
    }

    public void setPalette(List<Card> palette) {
        this.palette = palette;
    }

    @JsonIgnore
    public Card getHighest() {
        Collections.sort(palette);

        return palette.get(palette.size()-1);
    }


}
