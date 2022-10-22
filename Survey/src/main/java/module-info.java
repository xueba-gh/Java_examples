module com.example.survey {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.survey to javafx.fxml;
    exports com.example.survey;
}