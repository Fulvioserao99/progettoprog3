public class HardLabyrinth extends Labyrinth{
    HardLabyrinth(){
        super(16);
    }

    public void generateLab(){
        for (int i=1; i<3; i++)
            for (int j=2; j<13; j++)
                getCell(i,j).setValue(CellVal.wall);

        getCell(0,3).setValue(CellVal.wall);
        getCell(3,14).setValue(CellVal.wall);
        getCell(0,15).setValue(CellVal.wall);

        getCell(4,4).setValue(CellVal.wall);
        getCell(4,5).setValue(CellVal.wall);
        getCell(4,6).setValue(CellVal.wall);

        getCell(4,9).setValue(CellVal.wall);
        getCell(5,9).setValue(CellVal.wall);
        getCell(6,9).setValue(CellVal.wall);

        getCell(4,11).setValue(CellVal.wall);
        getCell(4,12).setValue(CellVal.wall);

        getCell(5,2).setValue(CellVal.wall);

        getCell(6,5).setValue(CellVal.wall);
        getCell(6,6).setValue(CellVal.wall);

        getCell(7,2).setValue(CellVal.wall);
        getCell(8,2).setValue(CellVal.wall);
        getCell(9,2).setValue(CellVal.wall);
        getCell(10,2).setValue(CellVal.wall);

        getCell(8,5).setValue(CellVal.wall);

        getCell(8,7).setValue(CellVal.wall);

        getCell(8,9).setValue(CellVal.wall);

        getCell(7,12).setValue(CellVal.wall);
        getCell(7,13).setValue(CellVal.wall);
        getCell(8,12).setValue(CellVal.wall);
        getCell(8,13).setValue(CellVal.wall);

        getCell(9,0).setValue(CellVal.wall);

        getCell(10,5).setValue(CellVal.wall);

        getCell(10,10).setValue(CellVal.wall);
        getCell(11,10).setValue(CellVal.wall);
        getCell(12,10).setValue(CellVal.wall);

        getCell(11,12).setValue(CellVal.wall);

        getCell(11,14).setValue(CellVal.wall);
        getCell(12,14).setValue(CellVal.wall);
        getCell(13,14).setValue(CellVal.wall);

        getCell(12,4).setValue(CellVal.wall);

        getCell(12,7).setValue(CellVal.wall);
        getCell(12,8).setValue(CellVal.wall);

        getCell(14,0).setValue(CellVal.wall);

        getCell(13,2).setValue(CellVal.wall);
        getCell(14,2).setValue(CellVal.wall);
        getCell(15,2).setValue(CellVal.wall);

        getCell(14,5).setValue(CellVal.wall);
        getCell(14,6).setValue(CellVal.wall);
        getCell(15,5).setValue(CellVal.wall);
        getCell(15,6).setValue(CellVal.wall);

        getCell(15,10).setValue(CellVal.wall);

        getCell(15,13).setValue(CellVal.wall);

    }

    public  void printNeighboursNumber(){


    };


    @Override
    public void printIds() {

    }
}
