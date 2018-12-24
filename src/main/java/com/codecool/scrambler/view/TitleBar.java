package com.codecool.scrambler.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

class TitleBar extends VBox {

    TitleBar() {
        Text title = new Text("Welcome to Super Scrambler 2000!");
        title.setFont(Font.font("Arial", 20));
        Text overview = new Text("Press spacebar to generate scramble!");

        this.getChildren().addAll(title, overview);
        this.setAlignment(Pos.CENTER);

        this.setPadding(new Insets(50));
    }
}
