public class Cell {

    private CellVal value;
    Position pos;


    public Cell(CellVal value, Position pos)  {
        this.value = value;
        this.pos = pos;

    }

    public Cell(){
        this.value = CellVal.empty;

    }

    public CellVal getValue() {
        return value;
    }

    public void setValue(CellVal value) {
        this.value = value;
    }

    public void getNeighbours(){

    }

}
