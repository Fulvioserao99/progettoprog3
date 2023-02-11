package com.example.robot_3;

import java.util.ArrayList;

public interface Strategy {
    ArrayList<Integer> calculateNextMove(Cell cell);
}
