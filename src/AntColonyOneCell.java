import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;

public class AntColonyOneCell implements Strategy{

    private AntSystem aco;

    public AntColonyOneCell(Map<Pair<Integer, Integer>, Integer> edges) {
        this.aco = new AntSystem(edges, 100, 500);
    }

    @Override
    public ArrayList<Integer> calculateNextMove(Cell cell) {
        Vector<Integer>path;
        do{
            path = aco.path(cell.getId(),aco.getNodes().size()-1);
        }
        while(path.size() == 0);
        ArrayList<Integer> result = new ArrayList<>(1);
        result.add(path.get(1));
        return result;
    }
}
