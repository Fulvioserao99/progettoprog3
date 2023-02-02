import java.util.ArrayList;

public class Cell {

    private CellVal value;
    Position pos;

    ArrayList<Cell> neighbours;


    public Cell(CellVal value, Position pos)  {
        this.value = value;
        this.pos = pos;
        this.neighbours = new ArrayList<>(8);

    }

    public Cell(){
        this.value = CellVal.empty;

    }

    public void addNeighbours(Cell neighbour) {
        this.neighbours.add(neighbour);
    }

    public ArrayList<Cell> getNeighbours() {
        return neighbours;
    }

    public CellVal getValue() {
        return value;
    }

    public void setValue(CellVal value) {
        this.value = value;
    }



}
