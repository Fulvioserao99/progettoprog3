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
        /*Game instance = new Game("romano","pertosi",3);
        instance.printLabyrinth();
        instance.updateCells();
        instance.printLabyrinth();
        System.out.println();
        System.out.println();
        System.out.println(instance.nextMove());
        System.out.println();
        instance.changeRobotState();
        System.out.println(instance.nextMove());*/
        Game instance = new Game("romano","pertosi",3);
        instance.printLabyrinth();
        instance.updateCells();
        instance.printLabyrinth();
        System.out.println();
        Position pos = new Position(9,9);
        System.out.println(instance.getRobotPos().getX() + " " + instance.getRobotPos().getY());
        while (instance.getRobotPos().getX() != pos.getX() && instance.getRobotPos().getY() != pos.getY()){
            System.out.println(instance.getRobotPos().getX() + " " + instance.getRobotPos().getY());
            instance.move();
        }
        instance.move();
        System.out.println(instance.getRobotPos().getX() + " " + instance.getRobotPos().getY());
        /*System.out.println(instance.getRobotPos().getX() + " " + instance.getRobotPos().getY());
        instance.move();
        System.out.println(instance.getRobotPos().getX() + " " + instance.getRobotPos().getY());
        instance.move();
        System.out.println(instance.getRobotPos().getX() + " " + instance.getRobotPos().getY());
        instance.move();
        System.out.println(instance.getRobotPos().getX() + " " + instance.getRobotPos().getY());*/

    }

}
