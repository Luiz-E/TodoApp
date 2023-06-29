module com.luizedu.todoapp {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.luizedu.todoapp to javafx.fxml;
    exports com.luizedu.todoapp;
}