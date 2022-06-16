module com.example.project_with_gui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.project_with_gui to javafx.fxml;
    exports com.example.project_with_gui;
}