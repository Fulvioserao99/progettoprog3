public class Robot implements State{
    private State robotState;
    private int x;
    private int y;

    public void setRobotState(State robotState) {
        this.robotState = robotState;
    }

    public State getRobotState() {
        return robotState;
    }

    @Override
    public void doAction() {
        this.robotState.doAction();
    }
}
