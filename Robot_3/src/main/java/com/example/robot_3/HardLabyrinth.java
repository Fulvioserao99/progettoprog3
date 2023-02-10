package com.example.robot_3;

public class HardLabyrinth extends Labyrinth{
    HardLabyrinth(){
        super(10);
    }

    public void generateLab(){
        getCell(0,6).setValue(CellVal.wall);
        getCell(0,7).setValue(CellVal.wall);
        getCell(1,6).setValue(CellVal.wall);
        getCell(1,7).setValue(CellVal.wall);

        getCell(1,2).setValue(CellVal.wall);
        getCell(1,3).setValue(CellVal.wall);
        getCell(2,2).setValue(CellVal.wall);
        getCell(2,3).setValue(CellVal.wall);

        getCell(2,9).setValue(CellVal.wall);

        getCell(3,4).setValue(CellVal.wall);
        getCell(3,5).setValue(CellVal.wall);
        getCell(4,4).setValue(CellVal.wall);
        getCell(4,5).setValue(CellVal.wall);

        getCell(0,3).setValue(CellVal.wall);
        getCell(0,4).setValue(CellVal.wall);

        getCell(4,7).setValue(CellVal.wall);
        getCell(4,8).setValue(CellVal.wall);
        getCell(5,7).setValue(CellVal.wall);
        getCell(5,8).setValue(CellVal.wall);

        getCell(5,2).setValue(CellVal.wall);
        getCell(5,3).setValue(CellVal.wall);
        getCell(6,2).setValue(CellVal.wall);
        getCell(6,3).setValue(CellVal.wall);

        getCell(6,5).setValue(CellVal.wall);

        getCell(7,6).setValue(CellVal.wall);
        getCell(7,7).setValue(CellVal.wall);
        getCell(8,6).setValue(CellVal.wall);
        getCell(8,7).setValue(CellVal.wall);

        getCell(8,0).setValue(CellVal.wall);
        getCell(8,1).setValue(CellVal.wall);
        getCell(9,0).setValue(CellVal.wall);
        getCell(9,1).setValue(CellVal.wall);

        getCell(8,3).setValue(CellVal.wall);
        getCell(8,3).setValue(CellVal.wall);
        getCell(9,4).setValue(CellVal.wall);
        getCell(9,4).setValue(CellVal.wall);

        getCell(8,9).setValue(CellVal.wall);
        getCell(9,8).setValue(CellVal.wall);

    }


}
