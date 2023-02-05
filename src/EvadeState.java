import java.util.ArrayList;
import java.util.Map;

public class EvadeState implements State {

    private Cell cell;
    Strategy strategy;

    EvadeState(Cell cell){
        this.strategy = new RandomMove();
        this.cell = cell;
    }
    @Override
    public ArrayList<Integer> doAction(Cell cell) {
        return strategy.calculateNextMove(cell);
    }
}
