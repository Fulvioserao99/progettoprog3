import java.util.ArrayList;

public class MediumLabyrinth extends Labyrinth {

    MediumLabyrinth() {
        super(8);
    }

    public void generateLab() {
        getCell(1, 2).setValue(CellVal.wall);
        getCell(1, 3).setValue(CellVal.wall);
        getCell(2, 2).setValue(CellVal.wall);
        getCell(2, 3).setValue(CellVal.wall);

        getCell(1, 6).setValue(CellVal.wall);
        getCell(1, 7).setValue(CellVal.wall);

        getCell(3, 7).setValue(CellVal.wall);

        getCell(5, 1).setValue(CellVal.wall);

        getCell(4, 4).setValue(CellVal.wall);
        getCell(4, 5).setValue(CellVal.wall);
        getCell(5, 4).setValue(CellVal.wall);
        getCell(5, 5).setValue(CellVal.wall);

        getCell(7, 3).setValue(CellVal.wall);

    }

    public void printNeighboursNumber() {

        for (int i = 0; i < 8; i++) {
            System.out.println();
            for (int j = 0; j < 8; j++){
                System.out.print(this.getCell(i,j).getNeighbours().size());
            }
        }
    };

    public void printIds() {

        for (int i = 0; i < 8; i++) {
            System.out.println();
            for (int j = 0; j < 8; j++){
                System.out.print(this.getCell(i,j).getId());
            }
        }
    };




}


