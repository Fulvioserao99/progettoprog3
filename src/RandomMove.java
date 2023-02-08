import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomMove implements Strategy{

    MultiMap<Integer, Integer> edges;
    RandomMove(MultiMap<Integer, Integer> edges) {
        this.edges = edges;
    }

    @Override
    public ArrayList<Integer> calculateNextMove(Cell cell) {

        ArrayList<Integer> collection = (ArrayList<Integer>) edges.get(cell.getId());
        int randomNum = ThreadLocalRandom.current().nextInt(0, collection.size());
        ArrayList<Integer> result = new ArrayList<>(1);
        result.add(collection.get(randomNum));
        return result;

    }
}
