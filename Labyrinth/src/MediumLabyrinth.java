import java.util.ArrayList;

public class MediumLabyrinth extends Labyrinth {

    MediumLabyrinth() {
        super(8, 8);
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
                System.out.print(this.getLab()[i][j].getNeighbours(8).size());
                if (i==7 && j == 7){
                    System.out.println("0;0 --->");
                    ArrayList<Position> var = this.getLab()[i][j].getNeighbours(8);
                    for (int k=0; k<var.size(); k++){
                        System.out.print("x:" + var.get(k).getX() + " y:" + var.get(k).getY());
                        System.out.println();
                    }

                }
            }


        };

    }

}
