package com.luizedu.todoapp.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("/com/luizedu/todoapp/MainScreen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 900, 720);
        scene.getStylesheets().add(Objects.requireNonNull(Main.class.getResource("/css/main.css")).toExternalForm());
        stage.setTitle("TodoApp");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}