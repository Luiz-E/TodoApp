package com.luizedu.todoapp.controller;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class AddTaskController implements Initializable {
    public ImageView checkView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image check = new Image(Objects.requireNonNull(AddTaskController.class.getResource("/images/check.png")).toExternalForm());
        checkView.setImage(check);
    }

    public void init() {
        FXMLLoader loader = new FXMLLoader(AddTaskController.class.getResource("/com/luizedu/todoapp/AddTask.fxml"));
        try {
            Scene scene = new Scene(loader.load(), 300, 280);
            Stage stage = new Stage();
            scene.getStylesheets().add(Objects.requireNonNull(AddTaskController.class.getResource("/css/add.css")).toExternalForm());

            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
