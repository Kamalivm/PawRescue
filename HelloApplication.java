package com.example.fxproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login page.fxml"));

        Scene firstscene = new Scene(loginfxmlLoader.load());

        stage.setTitle("Pet_Adoption_System");
        stage.setScene(firstscene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}