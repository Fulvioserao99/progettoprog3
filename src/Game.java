import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
public class Game {

    private Labyrinth lab;

    private Robot robot;

    //file?

    Game(String nome, String cognome, int difficolta){

        LabCreator labi;


        switch(difficolta){

            case 1:
                labi = new EasyLabCreator();
                this.lab = (EasyLabyrinth) labi.createLab();
                break;

            case 2:
                labi = new MediumLabCreator();
                this.lab = (MediumLabyrinth) labi.createLab();
                break;
            case 3:
                labi = new HardLabCreator();
                this.lab = (HardLabyrinth) labi.createLab();
                break;
        }
        this.robot = new Robot(nome,cognome,lab.getCell(0,0),new PursuitState(this.lab.getEdge2distance(), this.lab.getCell(0,0)));

    }

    public Labyrinth getLab() {
        return lab;
    }

    void updateCells(){
        int randomNum;
        Cell[][] maze = this.lab.getLab();
        for(int i=0; i<this.lab.getDim(); i++)
            for(int j=0; j<this.lab.getDim(); j++) {
                if( i == 0 && j ==0)
                    continue;


                if (maze[i][j].getValue() != CellVal.wall && maze[i][j] != maze[this.lab.getDim() - 1][this.lab.getDim() - 1]) {
                    randomNum = ThreadLocalRandom.current().nextInt(0, 12);
                    if (randomNum < 4)
                        continue;
                    else if (randomNum >= 4 && randomNum < 6)
                        maze[i][j].setValue(CellVal.yellow);
                    else if (randomNum >= 6 && randomNum < 8)
                        maze[i][j].setValue(CellVal.red);
                    else if (randomNum >= 8 && randomNum < 10)
                        maze[i][j].setValue(CellVal.cyan);
                    else if (randomNum >= 10 && randomNum < 12)
                        maze[i][j].setValue(CellVal.green);
                }
            }
    }

    void printLabyrinth(){
        this.lab.printLab();
    }
    ArrayList<Integer> nextMove(){
        return this.robot.doAction(this.robot.getActualCell());
    }

    void changeRobotState(){
        this.robot.setRobotState(new FleeState(this.lab.getEdge2distance(), this.lab.getCell(0,0)));
    }
}
