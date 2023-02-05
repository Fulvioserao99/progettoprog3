import java.util.Map;
import java.util.Vector;
public interface State {
    public  Vector<Integer> doAction(Strategy strat, Map<Pair<Integer, Integer>, Integer> edge, int source, int dest);
}
