import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class RandomMove implements Strategy{

    RandomMove() {

    }

    @Override
    public ArrayList<Integer> calculateNextMove(Cell cell) {
        int randomNum = ThreadLocalRandom.current().nextInt(0, cell.getNeighbours().size());
        ArrayList<Integer> result = new ArrayList<>(1);
        result.add(cell.getNeighbours().get(randomNum).getId());
        return result;

    }
}
