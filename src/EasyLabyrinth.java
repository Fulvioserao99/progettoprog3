public class EasyLabyrinth extends Labyrinth{

    EasyLabyrinth(){
        super(8);
    }

    public void generateLab(){
        getCell(1,2).setValue(CellVal.wall);
        getCell(2,2).setValue(CellVal.wall);
    }

    public void printNeighboursNumber(){


    };


    @Override
    public void printIds() {

    }
}
