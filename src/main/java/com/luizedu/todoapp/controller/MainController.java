package com.luizedu.todoapp.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    public Label toolBarTitle;
    public ImageView tickView;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image tick = new Image(Objects.requireNonNull(MainController.class.getResource("/images/tick.png")).toExternalForm());
        tickView.setImage(tick);
    }
}