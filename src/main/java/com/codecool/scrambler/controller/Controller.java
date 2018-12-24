package com.codecool.scrambler.controller;

import com.codecool.scrambler.model.Cube;
import com.codecool.scrambler.model.Scrambler;
import com.codecool.scrambler.view.WindowDisplay;
import javafx.scene.input.KeyCode;

public class Controller {
    private Cube cube;
    private Scrambler scrambler;
    private WindowDisplay windowDisplay;

    public Controller() {
        this.cube = new Cube();
        this.scrambler = new Scrambler(20);
        this.windowDisplay = new WindowDisplay();
    }

    public WindowDisplay getWindowDisplay() {
        return windowDisplay;
    }

    public void start() {
        System.out.println("Starting...");
        windowDisplay.getScene().setOnKeyPressed(event -> {
            if (event.getCode().equals(KeyCode.SPACE)) {
                scrambler.scramble(cube);
                windowDisplay.updateScramble(scrambler.getScrambleString());
            }
        });
    }
}
