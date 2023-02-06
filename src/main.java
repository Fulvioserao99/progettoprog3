import java.util.Vector;

public class main {

    public static void main(String[] args) {
        //LabCreator lab = new MediumLabCreator();
        //MediumLabyrinth maze = (MediumLabyrinth) lab.createLab();
        //maze.createGraph();
        //maze.printLab();
        //System.out.println();
        //Vector<Integer> solution = maze.antColonyOptimization(maze.getEdge2distance(),0,58);
        //System.out.println(solution);
        Game instance = new Game("romano","pertosi",2);
        instance.printLabyrinth();
        instance.updateCells();
        instance.printLabyrinth();
        System.out.println();
        instance.getLab().printNeighboursNumber();
        System.out.println();
        System.out.println(instance.nextMove());
        System.out.println();
        instance.changeRobotState();
        System.out.println(instance.nextMove());

    }

}
