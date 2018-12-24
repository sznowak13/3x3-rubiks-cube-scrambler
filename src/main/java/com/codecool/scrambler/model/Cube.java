package com.codecool.scrambler.model;

public class Cube {
    private Wall[] walls;

    Wall getRandomWall() {
        return walls[(int) (Math.random() * walls.length)];
    }

    public Cube() {
        this.walls = Wall.values();
    }
}
