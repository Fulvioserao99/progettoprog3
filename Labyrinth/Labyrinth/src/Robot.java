public class Robot implements State{
    private State robotState;
    private State prevState;
    private String nome;
    private String cognome;

    Position pos;

    Robot(String nome, String cognome){
        robotState = new PursuitState();
        prevState = null;
        this.nome = nome;
        this.cognome = cognome;
        pos.setX(0);
        pos.setY(0);

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
    public void doAction() {
        this.robotState.doAction();
    }
}
