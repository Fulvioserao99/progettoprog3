import java.util.ArrayList;

public class Robot{
    private State robotState;
    private State prevState;
    private String nome;
    private String cognome;


    Cell actualCell;

    Robot(String nome, String cognome, Cell cell, State robotState){
        this.robotState = robotState;
        prevState = null;
        this.nome = nome;
        this.cognome = cognome;
        this.actualCell = cell;

    }

    public void setActualCell(Cell actualCell) {
        this.actualCell = actualCell;
    }

    Position getPositionCoords(){
        return this.actualCell.getPos();
    }

    public Cell getActualCell() {
        return actualCell;
    }

    public CellVal getActualCellValue() {
        return actualCell.getValue();
    }

    public void setRobotState(State robotState) {
        this.robotState = robotState;
    }

    public State getRobotState() {
        return robotState;
    }

    public void setPrevState(State prevState) {
        this.prevState = prevState;
    }

    public State getPrevState() {
        return prevState;
    }
    public ArrayList<Integer> doAction(Cell cell) {
        return this.robotState.doAction(cell);
    }
}
