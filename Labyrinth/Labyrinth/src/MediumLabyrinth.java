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

    public void createGraph(){

        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if (this.getCell(i,j).getValue() == CellVal.wall)
                    continue;

                if(i-1 >= 0 && j-1 >=0)
                    if (this.getCell(i-1,j-1).getValue() != CellVal.wall)
                       this.getCell(i,j).addNeighbours(this.getCell(i-1,j-1));

                if(i >=0 && j-1>=0)
                    if (this.getCell(i,j-1).getValue() != CellVal.wall)
                        this.getCell(i,j).addNeighbours(this.getCell(i,j-1));

                if(i+1 >=0 && j-1 >=0 && j-1<=8-1 && i+1 <=8-1)
                    if (this.getCell(i+1,j-1).getValue() != CellVal.wall)
                        this.getCell(i,j).addNeighbours(this.getCell(i+1,j-1));

                if(i+1 <=8-1 && j <= 8-1 && i+1 >=0 && j >=0)
                    if (this.getCell(i+1,j).getValue() != CellVal.wall)
                        this.getCell(i,j).addNeighbours(this.getCell(i+1,j));

                if(i+1 <=8-1 && j+1 <=8-1 && i+1 >=0 && j+1 >=0)
                    if (this.getCell(i+1,j+1).getValue() != CellVal.wall)
                        this.getCell(i,j).addNeighbours(this.getCell(i+1,j+1));

                if(i <=8-1 && j+1 <=8-1 && i >=0 && j >=0)
                    if (this.getCell(i,j+1).getValue() != CellVal.wall)
                        this.getCell(i,j).addNeighbours(this.getCell(i,j+1));

                if(i-1 <=8-1 && j+1 <=8-1 && i-1 >=0 && j+1 >=0)
                    if (this.getCell(i-1,j+1).getValue() != CellVal.wall)
                        this.getCell(i,j).addNeighbours(this.getCell(i-1,j+1));

                if(i-1 >=0 && j >=0 && i-1 <=8-1 && j <=8-1)
                    if (this.getCell(i-1,j).getValue() != CellVal.wall)
                        this.getCell(i,j).addNeighbours(this.getCell(i-1,j));
            }
        }

    }
    public void printNeighboursNumber() {

        for (int i = 0; i < 8; i++) {
            System.out.println();
            for (int j = 0; j < 8; j++){
                System.out.print(this.getCell(i,j).getNeighbours().size());
            }
        }
    };



}


