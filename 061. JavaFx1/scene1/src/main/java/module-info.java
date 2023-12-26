module com.example.scene1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.scene1 to javafx.fxml;
    exports com.example.scene1;
}