package com.luizedu.todoapp.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class MainController implements Initializable {

    @FXML
    public Label toolBarTitle;
    public ImageView tickView;
    public GridPane gridPane;
    public ImageView addProject;
    public ImageView addTask;

    private AddProjectController addProjectController;
    private AddTaskController addTaskController;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        setTickView();
        setGridColumnConstraints();
        setGridRowConstraints();
        setAddImages();

        addProjectController = new AddProjectController();
        addTaskController = new AddTaskController();
    }
    @FXML
    private void handleAddProject() {
        if (addProjectController != null) {
            addProjectController.init();
        }
    }

    @FXML
    private void handleAddTask() {
        if (addTaskController != null) {
            addTaskController.init();
        }
    }

    private void setAddImages() {
        Image add = new Image(Objects.requireNonNull(MainController.class.getResource("/images/add.png")).toExternalForm());
        addProject.setImage(add);
        addTask.setImage(add);
    }

    private void setGridRowConstraints() {
        RowConstraints rowAddItems = new RowConstraints();
        rowAddItems.setPrefHeight(50);
        rowAddItems.setMinHeight(50);
        gridPane.getRowConstraints().add(rowAddItems);

        RowConstraints rowListItems = new RowConstraints();
        rowListItems.setVgrow(Priority.ALWAYS);
        gridPane.getRowConstraints().add(rowListItems);
    }

    private void setGridColumnConstraints() {
        ColumnConstraints projectsColumnConstraints = new ColumnConstraints();
        projectsColumnConstraints.setPercentWidth(20);
        ColumnConstraints tasksColumnsConstraints = new ColumnConstraints();
        tasksColumnsConstraints.setPercentWidth(100);
        gridPane.getColumnConstraints().addAll(projectsColumnConstraints, tasksColumnsConstraints);
    }
    private void setTickView() {
        Image tick = new Image(Objects.requireNonNull(MainController.class.getResource("/images/tick.png")).toExternalForm());
        tickView.setImage(tick);
    }
}