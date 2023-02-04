import java.util.ArrayList;

public interface Strategy {
    Cell calculateNextMove(Cell[][] lab, int dim);
}
