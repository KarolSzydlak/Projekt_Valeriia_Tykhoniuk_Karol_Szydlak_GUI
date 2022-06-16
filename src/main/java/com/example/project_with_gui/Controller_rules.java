package com.example.project_with_gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller_rules {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Continue;

    @FXML
    void initialize() {
        Continue.setOnAction(event -> {
            Continue.getScene().getWindow().hide();

            FXMLLoader fxmlLoader3 = new FXMLLoader(Menu.class.getResource("simulation.fxml"));
            Scene scene = null;
            try {
                scene = new Scene(fxmlLoader3.load(), 700, 400);
            } catch (IOException e) {
                e.printStackTrace();
            }
            Stage stage = new Stage();
            stage.setTitle("Life of ants");
            stage.setScene(scene);
            stage.show();

        } );

    }

}