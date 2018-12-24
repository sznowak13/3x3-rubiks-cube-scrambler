package com.codecool.scrambler.view;

import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;

public class WindowDisplay extends BorderPane {
    private ScrambleArea scrambleArea = new ScrambleArea();

    public WindowDisplay() {
        this.setTop(new TitleBar());
        this.setCenter(this.scrambleArea);
    }

    public void updateScramble(String newScrambleString) {
        Text scrambleText = this.scrambleArea.getScrambleText();
        scrambleText.setText(newScrambleString);
    }
}
