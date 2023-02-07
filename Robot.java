import java.io.IOException;

public class Robot {
    private String name;
    private String surname;
    private int steps;
    private Result result;

    public Robot(String name, String surname, int steps, Result result) {
        this.name = name;
        this.surname = surname;
        this.steps = steps;
        this.result = result;
    }
    public void print() throws IOException {
        //algoritmo di risoluzione
        result.writeResult(name,surname,steps);
    }
}
