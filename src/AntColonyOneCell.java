import java.util.ArrayList;
import java.util.Map;


public class AntColonyOneCell implements Strategy{

    private AntSystem aco;

    public AntColonyOneCell(MultiMap<Integer, Integer> edges) {
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
        ArrayList<Integer>path;
        int solution;
        do{
            path = aco.pathCalculator(cell.getId(),aco.getNodes()-1);
        }
        while(path.size() == 0);
        solution = path.get(1);
        path.clear();
        path.add(solution);
        return path;
    }
}
