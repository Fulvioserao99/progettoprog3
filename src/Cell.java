import java.util.ArrayList;

public class Cell {

    private CellVal value;

    private Position pos;

    Integer id;



    public Cell(CellVal value, Position pos, int id)  {
        this.value = value;
        this.pos = pos;
        this.id = id;

    }

    public Cell(CellVal value, Position pos)  {
        this.value = value;
        this.pos = pos;

    }

    public Cell(){
        this.value = CellVal.empty;

    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
