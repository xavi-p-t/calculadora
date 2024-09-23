package com.calc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application{
    final int WINDOW_WIDTH = 262;
    final int WINDOW_HEIGHT = 436;

    @Override
    public void start(Stage stage) throws Exception {


        Parent root = FXMLLoader.load(getClass().getResource("/assets/controler.fxml"));
        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.setTitle("calculadora Xavier Palma");
        stage.setWidth(WINDOW_WIDTH);
        stage.setHeight(WINDOW_HEIGHT);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}