import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;

public interface Strategy {
    public Vector<Integer> calculateNextMove(Map<Pair<Integer, Integer>, Integer> edge, int source, int dest);
}
