package com.example.robot_3;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.util.ArrayList;

public class LabController{


    @FXML
    Label punteggio;
    @FXML
    Button playBTN;
    @FXML
    Rectangle Robot;
    @FXML
    ArrayList<Rectangle> matrix;
    @FXML
    Label LabelNome;
    @FXML
    Label LabelCognome;

    private Cell[][] Field;
    private Game instance;
    private ExampleSub example;
    private int steps = 0;
    private Timeline timeline;

    private LabCommand command;


    LabController(LabCommand command){

        this.command = command;

    }

    public void initialize() {
        instance = new Game(command.nome, command.cognome,command.diff);
        example = new ExampleSub();
        LabelNome.setText(command.nome);
        LabelCognome.setText(command.cognome);
    }

    public void onPlayButton(){
        playBTN.setDisable(true);
        instance.subscribe(example);

        timeline = new Timeline(new KeyFrame(Duration.seconds(3), event -> {
            instance.notifySubscribers();

            steps++;
            punteggio.setText("Steps: " + steps);
            instance.move();
            instance.updateCells();
            Field = example.getLab();
            for(int i = 0; i < example.getDim(); i++)
                for(int j = 0; j < example.getDim(); j++)
                    if(Field[i][j].getValue() == CellVal.wall) { }
                    else
                    {
                        if(Field[i][j].getValue() == CellVal.cyan)
                            matrix.get(i*example.getDim() + j).setFill(Color.CYAN);
                        else if(Field[i][j].getValue() == CellVal.red)
                            matrix.get(i*example.getDim() + j).setFill(Color.RED);
                        else if(Field[i][j].getValue() == CellVal.green)
                            matrix.get(i*example.getDim() + j).setFill(Color.GREEN);
                        else if(Field[i][j].getValue() == CellVal.yellow)
                            matrix.get(i*example.getDim() + j).setFill(Color.YELLOW);
                        else
                            matrix.get(i*example.getDim() + j).setFill(Color.GREY);
                    }
            instance.notifySubscribers();

            //example.printLabRobot();

            if (instance.getRobotPos() == instance.goal()) {
                System.out.println("Game Over!");
                timeline.stop();
            }



            Robot.setLayoutX((Robot.getLayoutX() + (example.getUpdate().getY() * 50)));
            Robot.setLayoutY(((Robot.getLayoutY() + (example.getUpdate().getX() * 50))));
        }));

        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

}