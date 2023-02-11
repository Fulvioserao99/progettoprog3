package com.example.robot_3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class HelloApplication extends Application {


    String nome,cognome;



    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("main-menu.fxml"));
        fxmlLoader.setController(this);
        Scene scene = new Scene(fxmlLoader.load(), 1600, 720);
        stage.setTitle("Robot 3");
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    Button playBTN, optionsBTN, exitBTN, easyBTN, mediumBTN, hardBTN;

    static ArrayList<LabCommand> commands = new ArrayList<>();

    @FXML
    TextField Text1,Text2;

    @FXML
    Label Label1,Label2;

    @FXML
    public void playScene() {
        playBTN.setVisible(false);
        optionsBTN.setVisible(false);
        exitBTN.setVisible(false);

        Label1.setVisible(true);
        Label2.setVisible(true);
        Text1.setVisible(true);
        Text2.setVisible(true);
        easyBTN.setVisible(true);
        mediumBTN.setVisible(true);
        hardBTN.setVisible(true);
    }

    @FXML
    public void canPlayText1(){

        if(!Objects.equals(Text2.getText(), "")){
            easyBTN.setDisable(false);
            mediumBTN.setDisable(false);
            hardBTN.setDisable(false);
        }

    }

    @FXML
    public void canPlayText2(){

        if(!Objects.equals(Text1.getText(), "")){
            easyBTN.setDisable(false);
            mediumBTN.setDisable(false);
            hardBTN.setDisable(false);
        }

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
        LoadEasyLab loadMaze = new LoadEasyLab(Text1.getText(),Text2.getText());
        loadMaze.loadLab(event);
    }
    @FXML
    public void mediumPlay(ActionEvent event) throws IOException
    {
        LoadMediumLab loadMaze = new LoadMediumLab(Text1.getText(),Text2.getText());
        loadMaze.loadLab(event);
    }
    @FXML
    public void hardPlay(ActionEvent event) throws IOException
    {
        LoadHardLab loadMaze = new LoadHardLab(Text1.getText(),Text2.getText());
        loadMaze.loadLab(event);
    }



    public static void main(String[] args){

        launch();

    }
}