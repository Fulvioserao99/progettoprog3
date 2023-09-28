module com.example.robot_ {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.robot to javafx.fxml;
    exports com.example.robot;
    exports com.example.robot.Strategy;
    opens com.example.robot.Strategy to javafx.fxml;
    exports com.example.robot.State;
    opens com.example.robot.State to javafx.fxml;
    exports com.example.robot.Proxy;
    opens com.example.robot.Proxy to javafx.fxml;
    exports com.example.robot.Command;
    opens com.example.robot.Command to javafx.fxml;
    exports com.example.robot.Observer;
    opens com.example.robot.Observer to javafx.fxml;
    exports com.example.robot.FactoryMethod;
    opens com.example.robot.FactoryMethod to javafx.fxml;
    exports com.example.robot.Graph;
    opens com.example.robot.Graph to javafx.fxml;
    exports com.example.robot.Multimap;
    opens com.example.robot.Multimap to javafx.fxml;
    exports com.example.robot.ACO;
    opens com.example.robot.ACO to javafx.fxml;
    exports com.example.robot.LabInteractors;
    opens com.example.robot.LabInteractors to javafx.fxml;

}