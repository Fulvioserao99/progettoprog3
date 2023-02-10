package com.example.robot_3;

import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

import java.util.ArrayList;

public class MediumLabController {
    @FXML
    Label mediumPunteggio;
    @FXML
    Button playBTN;
    @FXML
    Rectangle Robot;
    @FXML
    ArrayList<Rectangle> matrix;

    Cell[][] Field;
    Game instance;
    ExampleSub example;
    int steps = 0;
    Timeline timeline;

    public void initialize() {
        instance = new Game("romano","pertosi",2);
        example = new ExampleSub();
    }

    public void onPlayButton(){
        playBTN.setDisable(true);
        instance.subscribe(example);

        timeline = new Timeline(new KeyFrame(Duration.seconds(3), event -> {
            instance.notifySubscribers();

            steps++;
            mediumPunteggio.setText("Steps: " + steps);
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

        timeline.setCycleCount(timeline.INDEFINITE);
        timeline.play();
    }
}
