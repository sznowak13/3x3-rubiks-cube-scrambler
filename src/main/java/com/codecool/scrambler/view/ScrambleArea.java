package com.codecool.scrambler.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
 class ScrambleArea extends VBox {

    private Text scrambleText;

    ScrambleArea() {
        scrambleText = new Text("");
        scrambleText.setFont(Font.font("Arial", 15));

        this.getChildren().add(scrambleText);
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(50));
    }

    Text getScrambleText() {
        return scrambleText;
    }
}
