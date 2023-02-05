import java.util.Random;

public class EasyLabyrinth extends Labyrinth{

    EasyLabyrinth(){
        super(4,4);
    }

    public void generateLab(){
        getCell(1,2).setValue(CellVal.wall);
        getCell(2,2).setValue(CellVal.wall);
    }

    public void printNeighboursNumber(){


    }

    public void createGraph(){}

    @Override
    public void printIds() {

    }

    @Override
    /* Genera dei colori a caso nel labirinto controllando che le celle non siano delle mura prestabilite.
    Dovrebbe generare un numero random nell'intervallo 6 (max) e 3 (min) perché nell'enum di CellVal, se non ho capito male,
    i valori da 3 a 6 rappresentano i colori. Se così non fosse in quacche modo questa function va fixata
    (va fatto a prescindere).
     */
    public void generateColors() {
        for(int i = 0; i < getLab().length; i++) {
            for(int j = 0; j < getLab().length; i++) {
                if(getCell(i,j).getValue() != CellVal.wall)
                getCell(i,j).setValue(new Random().nextInt(CellVal.values().length));
            }
        }
    }
}
