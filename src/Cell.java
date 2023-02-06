import java.util.ArrayList;

public class Cell {

    private CellVal value;

    Boolean visited = false;
    private Position pos;

    Integer id;



    private ArrayList<Cell> neighbours;


    public Cell(CellVal value, Position pos, int id)  {
        this.value = value;
        this.pos = pos;
        this.neighbours = new ArrayList<>(8);
        this.id = id;

    }

    public Cell(CellVal value, Position pos)  {
        this.value = value;
        this.pos = pos;
        this.neighbours = new ArrayList<>(8);

    }

    public Cell(){
        this.value = CellVal.empty;
        this.neighbours = new ArrayList<>(8);

    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVisited(Boolean visited) {
        this.visited = visited;
    }

    public Boolean isVisited() {
        return visited;
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

    public Position getPos() {
        return pos;
    }

    public void setValue(CellVal value) {
        this.value = value;
    }



}
