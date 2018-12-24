package com.codecool.scrambler;

import com.codecool.scrambler.controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ScramblerApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception {
        Controller ctrl = new Controller();
        Scene scene = new Scene(ctrl.getWindowDisplay(), 640, 480);
        ctrl.start();

        primaryStage.setTitle("Scrambler");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
