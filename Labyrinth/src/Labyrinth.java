import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public abstract class Labyrinth implements ILabyrinth{

    private Cell[][] lab;
    private Position startPos;
    private Position endPos;
    public abstract void generateLab();

    int dim;
    private Map<Pair<Integer, Integer>, Integer> edge2distance;

    AntSystem aco;


    public Labyrinth(int col, int rows){

        lab = new Cell[col][rows];
        startPos = new Position(0,0);
        endPos = new Position(col-1,rows-1);
        int count=0;
        for(int i = 0; i < col; i++) {
            for(int j = 0; j < rows; j++) {
                lab[i][j] = new Cell(CellVal.empty,new Position(i,j),count++);
            }
        }
        this.edge2distance = new HashMap<>();
        this.dim = col;
    }
    public Cell[][] getLab() {
        return lab;
    }

    @Override
    public Cell getCell(int x, int y) {
        return lab[x][y];
    }

    @Override
    public void setCell(int x, int y, Cell cell) {
        lab[x][y] = cell;
    }

    public Vector<Integer> antColonyOptimization(Map<Pair<Integer, Integer>, Integer> edge, int source, int dest){

        aco = new AntSystem(edge,AntSystem.ANTS,AntSystem.ITERATIONS);
        Vector<Integer> bestPath = aco.path(source,dest);
        return bestPath;

    }

    public Map<Pair<Integer, Integer>, Integer> getEdge2distance() {
        return edge2distance;
    }

    public void setEdge2distance(Map<Pair<Integer, Integer>, Integer> edge2distance) {
        this.edge2distance = edge2distance;
    }

    public Position getEndPos() {
        return endPos;
    }

    public Position getStartPos() {
        return startPos;
    }

    public void setEndPos(Position endPos) {
        this.endPos = endPos;
    }

    public void setStartPos(Position startPos) {
        this.startPos = startPos;
    }

    public abstract void createGraph();

    public void printLab(){
        for(int i = 0; i < endPos.getX()+1; i++) {
            System.out.println();
            for(int j = 0; j < endPos.getX()+1; j++) {
                if(lab[i][j].getValue() == CellVal.wall)
                    System.out.print('w');
                if(lab[i][j].getValue() == CellVal.empty)
                    System.out.print('e');
            }
        }
    }

    public abstract void printNeighboursNumber();

    public abstract void printIds();

}
