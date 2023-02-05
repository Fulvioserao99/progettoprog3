import java.util.ArrayList;
import java.util.Map;

public class FleeState implements State{

    private Cell cell;
    Strategy strategy;

    FleeState(Map<Pair<Integer, Integer>, Integer> edges, Cell cell){
        this.strategy = new AntColonyTwoCells(edges);
        this.cell = cell;
    }
    @Override
    public ArrayList<Integer> doAction(Cell cell) {
        return strategy.calculateNextMove(cell);
    }
}
