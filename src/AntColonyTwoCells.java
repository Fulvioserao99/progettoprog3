import java.util.ArrayList;
import java.util.Map;


public class AntColonyTwoCells implements Strategy{

    private AntSystem aco;

    public AntColonyTwoCells(MultiMap<Integer, Integer> edges) {
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
            ants = 65;
            iterations = 100;
        }
        this.aco = new AntSystem(edges, ants, iterations);
    }

    @Override
    public ArrayList<Integer> calculateNextMove(Cell cell) {
        ArrayList<Integer>path;
        int size = 0;
        do{
            path = aco.pathCalculator(cell.getId(),aco.getNodes()-1);
        }
        while(path.size() == 0);
        ArrayList<Integer> result = new ArrayList<>(2);
        while (size < path.size() && size < 2)
            result.add(path.get(size++));

        return result;
    }
}
