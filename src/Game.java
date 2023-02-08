import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
public class Game {

    private Labyrinth lab;

    private Robot robot;

    ArrayList<PositionSubscriber> subscribers;

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
        this.robot = new Robot(nome,cognome,lab.getCellById(0),new PursuitState(this.lab.getEdges(), lab.getCellById(0)));
        subscribers = new ArrayList<>();
    }

    void subscribe(PositionSubscriber o){
        subscribers.add(o);
    }
    
    void unSubscribe(PositionSubscriber o){
        subscribers.remove(o);
    }
    
    void notifySubscribers(){
        for (PositionSubscriber o:subscribers) {
            o.update(this.robot.getPositionCoords(),this.getLab(),this.lab.getDim());
        }
    }

    public Cell[][] getLab() {
        return this.lab.getLab();
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
                        maze[i][j].setValue(CellVal.empty);
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

    Position goal(){
        return this.lab.getEndPos();
    }

    ArrayList<Integer> nextMove(){
        return this.robot.doAction(this.robot.getActualCell());
    }

    Position getRobotPos(){
        return this.robot.getPositionCoords();
    }

    void move(){
        ArrayList<Integer> nextMove;
        int size =0;

        if (this.robot.getActualCellValue() == CellVal.empty){
            nextMove = nextMove();
            while (size < nextMove.size()){
                this.robot.setActualCell(this.lab.getCellById(nextMove.get(size)));
                size++;
            }
        }

        else if (this.robot.getActualCellValue() == CellVal.green){
            this.robot.setRobotState(new PursuitState(this.lab.getEdges(), this.robot.getActualCell()));
            nextMove = nextMove();
            this.robot.setActualCell(this.lab.getCellById(nextMove.get(size)));
        }

        else if (this.robot.getActualCellValue() == CellVal.red){
            this.robot.setRobotState(new SeekState(this.lab.getEdges(), this.robot.getActualCell()));
            nextMove = nextMove();
            this.robot.setActualCell(this.lab.getCellById(nextMove.get(size)));
        }

        else if (this.robot.getActualCellValue() == CellVal.yellow){
            this.robot.setRobotState(new FleeState(this.lab.getEdges(), this.robot.getActualCell()));
            nextMove = nextMove();
            while (size < nextMove.size()){
                this.robot.setActualCell(this.lab.getCellById(nextMove.get(size)));
                size++;
            }
        }

        else if (this.robot.getActualCellValue() == CellVal.cyan){
            this.robot.setRobotState(new EvadeState(this.robot.getActualCell(),this.lab.getEdges()));
            nextMove = nextMove();
            this.robot.setActualCell(this.lab.getCellById(nextMove.get(size)));
        }


    }
}
