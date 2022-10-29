module com.example.oopwithnlayeredapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oopwithnlayeredapp to javafx.fxml;
    exports com.example.oopwithnlayeredapp;
}