import java.util.Vector;

public class main {

    public static void main(String[] args) {
        LabCreator lab = new MediumLabCreator();
        MediumLabyrinth maze = (MediumLabyrinth) lab.createLab();
        maze.createGraph();
        maze.printLab();
        System.out.println();
        Vector<Integer> solution = maze.antColonyOptimization(maze.getEdge2distance(),0,58);
        System.out.println(solution);


    }

}
