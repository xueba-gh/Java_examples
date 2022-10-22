package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("LOGIN PAGE 1.0");
        

        stage.setScene(scene);
        Image icon = new Image(getClass().getResourceAsStream("images/java.png"));
       stage.getIcons().add(icon);

        //Make up scene not Resizeable
        stage.setResizable(false);
        stage.show();
    }

    //add icon to java
    //

    //Stage.getIcons().add(icon);


    public static void main(String[] args) {
        launch();
    }
}