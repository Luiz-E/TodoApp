module com.luizedu.todoapp {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.luizedu.todoapp.main to javafx.fxml;
    exports com.luizedu.todoapp.main;
    exports com.luizedu.todoapp.controller;
    opens com.luizedu.todoapp.controller to javafx.fxml;
}