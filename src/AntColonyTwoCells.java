import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;

public class AntColonyTwoCells implements Strategy{

    private AntSystem aco;

    public AntColonyTwoCells(Map<Pair<Integer, Integer>, Integer> edges) {
        this.aco = new AntSystem(edges, 100, 100);
    }

    @Override
    public ArrayList<Integer> calculateNextMove(Cell cell) {
        Vector<Integer> path = aco.path(cell.getId(),aco.getEdge2distance().get(aco.getEdge2distance().size()-1));
        ArrayList<Integer> result = new ArrayList<>(2);
        result.add(path.get(1));
        result.add(path.get(2));
        return result;
    }
}
