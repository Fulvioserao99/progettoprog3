import java.util.Map;
import java.util.Vector;

public class AntColonyTwoCells implements Strategy {
    public Vector<Integer> calculateNextMove(Map<Pair<Integer, Integer>, Integer> edge, int source, int dest) {
        AntSystem aco = new AntSystem(edge,AntSystem.ANTS,AntSystem.ITERATIONS);
        Vector<Integer> nextMove = aco.path(source,dest);
        return nextMove;
    }
}
