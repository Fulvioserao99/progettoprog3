public class EasyLabyrinth extends Labyrinth{

    EasyLabyrinth(){
        super(4,4);
    }

    public void generateLab(){
        getCell(1,2).setValue(CellVal.wall);
        getCell(2,2).setValue(CellVal.wall);
    }


}
