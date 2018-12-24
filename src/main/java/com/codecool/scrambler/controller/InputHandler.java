package com.codecool.scrambler.controller;

import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class InputHandler {
    private static InputHandler instance = null;
    private boolean spacePressed = false;

    public static InputHandler getInstance() {
        if (instance == null) {
            instance = new InputHandler();
        }
        return instance;
    }

    private InputHandler() {

    }

    public EventHandler<KeyEvent> onSpacePressed = event -> {
        if (event.getCode().equals(KeyCode.SPACE)) {
            this.spacePressed = true;
        }
    };

    public boolean isSpacePressed() {
        return spacePressed;
    }
}
