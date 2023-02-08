import java.util.ArrayList;
import java.util.Map;

public class SeekState implements State{

    private Cell cell;
    Strategy strategy;

    SeekState(MultiMap<Integer, Integer> edges, Cell cell){
        this.strategy = new AntColonyOneCell(edges);
        this.cell = cell;
    }
    @Override
    public ArrayList<Integer> doAction(Cell cell) {
        return strategy.calculateNextMove(cell);
    }
}