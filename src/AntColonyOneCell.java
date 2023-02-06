import java.util.ArrayList;
import java.util.Map;
import java.util.Vector;

public class AntColonyOneCell implements Strategy{

    private AntSystem aco;

    public AntColonyOneCell(Map<Pair<Integer, Integer>, Integer> edges) {
        int ants,iterations;
        if (edges.size() == 256){
            ants = 100;
            iterations = 100;
        }
        else if (edges.size() > 256){
            ants = 200;
            iterations = 300;
        }
        else{
            ants = 50;
            iterations = 100;
        }
        this.aco = new AntSystem(edges, ants, iterations);
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
