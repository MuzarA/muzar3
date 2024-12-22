module org.example.employeedatabasemanagement {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.employeedatabasemanagement to javafx.fxml;
    exports org.example.employeedatabasemanagement;
}