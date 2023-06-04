module com.example.airportfinalproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.airportfinalproject to javafx.fxml;
    exports com.example.airportfinalproject;
}