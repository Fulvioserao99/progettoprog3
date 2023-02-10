module com.example.robot_3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.robot_3 to javafx.fxml;
    exports com.example.robot_3;
}