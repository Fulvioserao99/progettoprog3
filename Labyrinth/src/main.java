public class main {

    public static void main(String[] args) {
        LabCreator lab = new MediumLabCreator();
        ILabyrinth maze = lab.createLab();
        maze.printNeighboursNumber();


    }

}
