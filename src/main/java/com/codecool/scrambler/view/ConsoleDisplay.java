package com.codecool.scrambler.view;

public class ConsoleDisplay {
    private static ConsoleDisplay instance = null;

    private ConsoleDisplay() {

    }

    public static ConsoleDisplay getInstance() {
        if (instance == null) {
            instance = new ConsoleDisplay();
        }

        return instance;
    }

    public void printWelcome() {
        System.out.println("Welcome to SuperScrambler 2000.");
        System.out.println("This app will help you generate a scramble for your 3x3 Rubiks cube.");
        System.out.println("Press 'enter' for scramble.");
    }

    public void printScramble(String[] scramble) {
        for (String move: scramble) {
            System.out.print(move + " ");
        }
        System.out.println();
    }
}
