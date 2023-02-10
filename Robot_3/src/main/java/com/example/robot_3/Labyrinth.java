package com.example.robot_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public abstract class Labyrinth implements ILabyrinth{

    private Cell[][] lab;
    private Position startPos;
    private Position endPos;
    public abstract void generateLab();

    private int dim;

    private Graph<Cell> noWallCells;

    public Labyrinth(int dim){

        lab = new Cell[dim][dim];
        for(int i = 0; i < dim; i++) {
            for(int j = 0; j < dim; j++) {
                lab[i][j] = new Cell(CellVal.empty,new Position(i,j));
            }
        }
        this.startPos = lab[0][0].getPos();
        this.endPos = lab[dim-1][dim-1].getPos();
        this.dim = dim;
        this.noWallCells = new GraphLab(this.lab,this.dim);
    }
    public Cell[][] getLab() {
        return lab;
    }


    public Cell getCell(int x, int y) {
        return lab[x][y];
    }


    public MultiMap<Integer, Integer> getEdges() {
        return noWallCells.getEdges();
    }

    public Position getEndPos() {
        return endPos;
    }

    public int getDim() {
        return dim;
    }

    Cell getCellById(int id){
        return noWallCells.getNode(id);
    }

    public void createGraph() {
        this.noWallCells.graphGen();
    }

}
