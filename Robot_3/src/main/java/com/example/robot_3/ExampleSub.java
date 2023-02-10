package com.example.robot_3;

public class ExampleSub implements PositionSubscriber{
    Position pos;
    Position prevPos;
    Cell[][] lab;

    int dim;

    ExampleSub(){
        this.prevPos = new Position(0, 0);
        this.pos = null;
        this.lab = null;
    }

    public int getDim() {
        return dim;
    }

    public int getPosX() {
        return pos.getX();
    }

    public int getPosY(){
        return pos.getY();
    }

    public Cell[][] getLab() {
        return lab;
    }

    public int getPrevPosX()
    {
        return prevPos.getX();
    }
    public int getPrevPosY()
    {
        return prevPos.getY();
    }
    public void update(Position pos, Cell[][] lab, int dim){
        this.prevPos = this.pos;
        this.pos = pos;
        this.lab = lab;
        this.dim = dim;
    };

    public void printLabRobot(){
        System.out.println();
        for(int i = 0; i < dim; i++) {
            System.out.println();
            for(int j = 0; j < dim; j++) {
                if(lab[i][j].getPos() == pos){
                    System.out.print('O');
                    continue;
                }
                if(lab[i][j].getValue() == CellVal.wall)
                    System.out.print('w');
                if(lab[i][j].getValue() == CellVal.empty)
                    System.out.print('e');
                if(lab[i][j].getValue() == CellVal.red)
                    System.out.print('r');
                if(lab[i][j].getValue() == CellVal.yellow)
                    System.out.print('y');
                if(lab[i][j].getValue() == CellVal.cyan)
                    System.out.print('c');
                if(lab[i][j].getValue() == CellVal.green)
                    System.out.print('g');
            }
        }
    }

    public Position getUpdate()
    {
        Position newPos = new Position(0,0);

        newPos.setX(pos.getX() - prevPos.getX());
        newPos.setY(pos.getY() - prevPos.getY());

        return newPos;
    }

}
