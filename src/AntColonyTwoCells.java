import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;

public class AntColonyTwoCells implements Strategy{

    private AntSystem aco;

    public AntColonyTwoCells(Map<Pair<Integer, Integer>, Integer> edges) {
        this.aco = new AntSystem(edges, 100, 500);
    }

    @Override
    public ArrayList<Integer> calculateNextMove(Cell cell) {
        Vector<Integer>path;
        int size = 0;
        do{
            path = aco.path(cell.getId(),aco.getNodes().size()-1);
        }
        while(path.size() == 0);
        ArrayList<Integer> result = new ArrayList<>(2);

        while (size < path.size() && size < 2)
            result.add(path.get(size++));

        return result;
    }
}
