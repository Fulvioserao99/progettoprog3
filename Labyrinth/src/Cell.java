public class Cell {

    private CellVal value;
    private CellVal north;
    private CellVal south;
    private CellVal west;
    private CellVal east;

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
    public CellVal getOppositeDir(DirectionTo direction) {
        switch(direction) {
            case north:
                return this.getSouth();
            case south:
                return this.getNorth();
            case west:
                return this.getEast();
            case east:
                return this.getWest();
        }

        return null;
    }

    public void setOppositeDir(DirectionTo direction, CellVal value) {
        switch(direction) {
            case north:
                this.setSouth(value);
                break;
            case south:
                this.setNorth(value);
                break;
            case east:
                this.setWest(value);
                break;
            case west:
                this.setEast(value);
                break;
        }
    }


    public CellVal getDirection(DirectionTo direction) {
        switch(direction) {
            case north:
                return this.getNorth();
            case south:
                return this.getSouth();
            case east:
                return this.getEast();
            case west:
                return this.getWest();
        }

        return null;
    }


    public void setDirection(DirectionTo direction, CellVal value) {
        switch(direction) {
            case north:
                this.setNorth(value);
                break;
            case south:
                this.setSouth(value);
                break;
            case east:
                this.setEast(value);
                break;
            case west:
                this.setWest(value);
                break;
        }
    }
}
