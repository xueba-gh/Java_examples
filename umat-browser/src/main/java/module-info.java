module com.example.umatbrowser {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.umatbrowser to javafx.fxml;
    exports com.example.umatbrowser;
}