import java.util.Map;
import java.util.Vector;

public class EvadeState implements State {
    @Override
    public Vector<Integer> doAction(Strategy strat, Map<Pair<Integer, Integer>, Integer> edge, int source, int dest) {
        Vector<Integer> vect = new Vector<>();
        vect = strat.RandomMove(edge,source,dest);
        return vect;
    }
}
