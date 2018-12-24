package com.codecool.scrambler.model;

public class Scrambler {

    private int numberOfMoves;
    private String[] scramble;
    private Wall prevWall = null;
    private final String[] modifiers = new String[] {"", "`", "2"};

    public Scrambler(int numberOfMoves) {
        this.numberOfMoves = numberOfMoves;
        scramble = new String[numberOfMoves];
    }

    public String[] getScramble() {
        return scramble;
    }

    private String getRandomModifier() {
        return modifiers[(int) (Math.random() * 3)];
    }

    public int getNumberOfMoves() {
        return numberOfMoves;
    }

    public void setNumberOfMoves(int numberOfMoves) {
        this.numberOfMoves = numberOfMoves;
        scramble = new String[numberOfMoves];
    }

    public void scramble(Cube cube) {
        Wall nextWall;
        for (int i = 0; i < numberOfMoves; i++) {
            do {
                nextWall = cube.getRandomWall();
            } while (nextWall.equals(prevWall));
            prevWall = nextWall;
            scramble[i] = String.format("%s%s", nextWall, getRandomModifier());
        }
    }

    public String getScrambleString() {
        StringBuilder result = new StringBuilder();
        for (String move: scramble) {
            result.append(move).append(" ");
        }
        return result.toString();
    }
}
