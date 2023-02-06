public class ExampleSub implements PositionSubscriber{
    Position pos;
    Cell[][] lab;

    int dim;

    ExampleSub(){
        this.pos = null;
        this.lab = null;
    }

    public void update(Position pos, Cell[][] lab, int dim){
        this.pos = pos;
        this.lab = lab;
        this.dim = dim;
    };

    public void printLabRobot(){
        System.out.println();
        for(int i = 0; i < dim; i++) {
            System.out.println();
            for(int j = 0; j < dim; j++) {
                if(lab[i][j].getPos() == pos){
                    System.out.print('O');
                    continue;
                }
                if(lab[i][j].getValue() == CellVal.wall)
                    System.out.print('w');
                if(lab[i][j].getValue() == CellVal.empty)
                    System.out.print('e');
                if(lab[i][j].getValue() == CellVal.red)
                    System.out.print('r');
                if(lab[i][j].getValue() == CellVal.yellow)
                    System.out.print('y');
                if(lab[i][j].getValue() == CellVal.cyan)
                    System.out.print('c');
                if(lab[i][j].getValue() == CellVal.green)
                    System.out.print('g');
            }
        }
    }

}
