package com.example.robot_3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MainMenuController {

    @FXML
    Button playBTN, optionsBTN, exitBTN, easyBTN, mediumBTN, hardBTN;
    @FXML
    public void playScene(ActionEvent event) throws IOException {
        playBTN.setVisible(false);
        optionsBTN.setVisible(false);
        exitBTN.setVisible(false);

        easyBTN.setVisible(true);
        mediumBTN.setVisible(true);
        hardBTN.setVisible(true);
    }

    @FXML
    public void exit(ActionEvent event)
    {
        Stage stage = (Stage)((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    public void easyPlay(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("easyLab.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(fxmlLoader.load()));
    }
    @FXML
    public void mediumPlay(ActionEvent event) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("medium.fxml"));
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(fxmlLoader.load()));
    }
    @FXML
    public void hardPlay()
    {

    }
}