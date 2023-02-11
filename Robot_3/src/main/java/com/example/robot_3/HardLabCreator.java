package com.example.robot_3;

public class HardLabCreator extends LabCreator{
    @Override
    public ILabyrinth createLab() {
        HardLabyrinth lab =  new HardLabyrinth();
        lab.generateLab();
        lab.createGraph();
        return lab;
    }
}
