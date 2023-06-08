package com.example.proyectou6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader root = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(root.load(), 400, 600);
        String css = getClass().getResource("Style/app.css").toExternalForm();
        scene.getStylesheets().add(css);

        stage.setTitle("Jose Javier");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}//Avilez Vazquez Jose Javier