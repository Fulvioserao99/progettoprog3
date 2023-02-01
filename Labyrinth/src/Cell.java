import java.util.ArrayList;

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

    public ArrayList<Position> getNeighbours(int dim){

        ArrayList<Position> positions = new ArrayList<>(8);

        if(pos.getX()-1 >= 0 && pos.getY()-1 >=0)
            positions.add(new Position(pos.getX()-1,pos.getY()-1));

        if(pos.getX() >=0 && pos.getY()-1>=0)
            positions.add(new Position(pos.getX()-1,pos.getY()-1));

        if(pos.getX()+1 >=0 && pos.getY()-1 >=0 && pos.getY()-1<=dim-1 && pos.getX()+1 <=dim-1)
            positions.add(new Position(pos.getX()+1,pos.getY()-1));

        if(pos.getX()+1 <=dim-1 && pos.getY() <= dim-1 && pos.getX()+1 >=0 && pos.getY() >=0)
            positions.add(new Position(pos.getX()+1,pos.getY()));

        if(pos.getX()+1 <=dim-1 && pos.getY()+1 <=dim-1 && pos.getX()+1 >=0 && pos.getY()+1 >=0)
            positions.add(new Position(pos.getX()+1,pos.getY()+1));

        if(pos.getX() <=dim-1 && pos.getY()+1 <=dim-1 && pos.getX() >=0 && pos.getY()+1 >=0)
            positions.add(new Position(pos.getX(),pos.getY()+1));

        if(pos.getX()-1 <=dim-1 && pos.getY()+1 <=dim-1 && pos.getX()-1 >=0 && pos.getY()+1 >=0)
            positions.add(new Position(pos.getX()-1,pos.getY()+1));

        if(pos.getX()-1 >=0 && pos.getY() >=0 && pos.getX()-1 <=dim-1 && pos.getY() <=dim-1)
            positions.add(new Position(pos.getX()-1,pos.getY()));


        return positions;
    }

}
