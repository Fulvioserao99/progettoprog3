public class Cell {

    private CellVal value;
    private CellVal north;
    private CellVal east;
    private CellVal south;
    private CellVal west;

    public Cell(CellVal value, CellVal north, CellVal east, CellVal west, CellVal south)  {
        this.value = value;
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
    }

    public Cell(){
        this.value = CellVal.wall;
        this.north = CellVal.wall;
        this.east = CellVal.wall;
        this.south = CellVal.wall;
        this.west = CellVal.wall;
    }

    public CellVal getValue() {
        return value;
    }

    public void setValue(CellVal value) {
        this.value = value;
    }

    public CellVal getEast() {
        return east;
    }

    public void setEast(CellVal east) {
        this.east = east;
    }

    public CellVal getNorth() {
        return north;
    }

    public void setNorth(CellVal north) {
        this.north = north;
    }

    public CellVal getSouth() {
        return south;
    }

    public void setSouth(CellVal south) {
        this.south = south;
    }

    public CellVal getWest() {
        return west;
    }

    public void setWest(CellVal west) {
        this.west = west;
    }
}
