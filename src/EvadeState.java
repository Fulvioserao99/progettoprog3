import java.util.ArrayList;

public class EvadeState implements State {

    private Cell cell;
    Strategy strategy;

    EvadeState(Cell cell, MultiMap<Integer, Integer> edges){
        this.strategy = new RandomMove(edges);
        this.cell = cell;
    }
    @Override
    public ArrayList<Integer> doAction(Cell cell) {
        return strategy.calculateNextMove(cell);
    }
}
