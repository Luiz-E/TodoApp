package com.luizedu.todoapp.controller;

import com.luizedu.todoapp.main.Main;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class AddProjectController implements Initializable {
    public ImageView checkView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image check = new Image(Objects.requireNonNull(AddProjectController.class.getResource("/images/check.png")).toExternalForm());
        checkView.setImage(check);
    }

    public void init() {
        FXMLLoader loader = new FXMLLoader(AddProjectController.class.getResource("/com/luizedu/todoapp/AddProject.fxml"));
        try {
            Scene scene = new Scene(loader.load(), 300, 280);
            Stage stage = new Stage();
            scene.getStylesheets().add(Objects.requireNonNull(AddProjectController.class.getResource("/css/add.css")).toExternalForm());

            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
