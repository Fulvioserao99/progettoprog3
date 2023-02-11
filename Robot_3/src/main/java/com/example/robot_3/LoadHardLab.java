package com.example.robot_3;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoadHardLab extends LabCommand {


    LoadHardLab(String nome, String cognome){
        super(nome,cognome);
        this.diff  = 3;
    }
    @Override
    public void loadLab(Event event) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hard.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        LabController maze = new LabController(this);
        fxmlLoader.setController(maze);
        stage.setScene(new Scene(fxmlLoader.load()));

    }

}