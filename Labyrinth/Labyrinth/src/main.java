public class main {

    public static void main(String[] args) {
        LabCreator lab = new MediumLabCreator();
        ILabyrinth maze = lab.createLab();
        maze.createGraph();
        maze.printLab();
        System.out.println();
        maze.printNeighboursNumber();

    }

}
