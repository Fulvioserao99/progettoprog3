import java.util.Map;
import java.util.Vector;
public class SeekState implements State {
    @Override
    /* Passiamo come primo argomento l'istanza corretta di Strategy, cioè quella che ci serve se finiamo su un
    determinato State, cioè su un determinato colore associato allo State Seek
     */
    public  Vector<Integer> doAction(Strategy strat, Map<Pair<Integer, Integer>, Integer> edge, int source, int dest) {
        Vector<Integer> vect = new Vector<>();
        vect = strat.calculateNextMove(edge, source, dest);
        return vect;
    }
}
