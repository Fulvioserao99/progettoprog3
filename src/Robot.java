import java.util.ArrayList;

public class Robot implements State{
    private State robotState;
    private State prevState;
    private String nome;
    private String cognome;


    Cell actualCell;

    Robot(String nome, String cognome, Cell cell){
        robotState = null;
        prevState = null;
        this.nome = nome;
        this.cognome = cognome;
        this.actualCell = cell;

    }

    public void setActualCell(Cell actualCell) {
        this.actualCell = actualCell;
    }

    public Cell getActualCell() {
        return actualCell;
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


    @Override
    public ArrayList<Integer> doAction(Cell cell) {

        setActualCell(cell);
        return this.robotState.doAction(cell);
    }
}
