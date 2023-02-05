import java.util.Map;
import java.util.Vector;
public class PursuitState implements State {
    @Override
    public  Vector<Integer> doAction(Strategy strat, Map<Pair<Integer, Integer>, Integer> edge, int source, int dest) {
        Vector<Integer> vect = new Vector<>();
        vect = strat.calculateNextMove(edge, source, dest);
        return vect;
    }
}
