import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ProxyResult implements Result {
    private FileWriter file;

    public ProxyResult(FileWriter file) throws IOException {
        this.file = new FileWriter("results.txt");
}

 @Override
    public void writeResult(String name, String surname, int solution) throws IOException {
        file.write("Robot " + name + " " + surname + " has made" + " = " + solution + " steps to the exit");
        file.close();
    }
}
