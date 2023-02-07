import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("results.txt");
        Result result = new ProxyResult(file);
        Robot robot = new Robot("Paolo", "Barone", 10, result);
        robot.print();
    }
}
