package com.example.fxproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Pay_success_controller {

    @FXML
    void PAY(ActionEvent event) throws IOException {

        FXMLLoader loginfxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Psuccess.fxml"));
        Scene firstscene = new Scene(loginfxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("Pet_Adoption_System");
        stage.setScene(firstscene);

        stage.show();

    }

}