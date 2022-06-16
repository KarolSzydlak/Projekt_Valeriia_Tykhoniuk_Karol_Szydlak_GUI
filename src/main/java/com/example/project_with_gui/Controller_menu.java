package com.example.project_with_gui;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller_menu {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Startmenu;

    @FXML
    void initialize() {
        Startmenu.setOnAction(event -> {
            Startmenu.getScene().getWindow().hide();

            FXMLLoader fxmlLoader2 = new FXMLLoader(Menu.class.getResource("rules.fxml"));
            Scene scene = null;
            try {
                scene = new Scene(fxmlLoader2.load(), 700, 400);
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