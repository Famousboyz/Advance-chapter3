module com.example.chapter3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires pdfbox.app;


    opens com.example.chapter3 to javafx.fxml;
    exports com.example.chapter3;
    opens com.example.chapter3.controller to javafx.fxml;
    exports com.example.chapter3.controller;
}