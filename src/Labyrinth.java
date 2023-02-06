import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public abstract class Labyrinth implements ILabyrinth{

    private Cell[][] lab;
    private Position startPos;
    private Position endPos;
    public abstract void generateLab();

    private int dim;
    private Map<Pair<Integer, Integer>, Integer> edge2distance;

    private AntSystem aco;

    private ArrayList<Cell> graphNeighbours;

    public Labyrinth(int dim){

        lab = new Cell[dim][dim];
        startPos = new Position(0,0);
        endPos = new Position(dim-1,dim-1);
        int count=0;
        for(int i = 0; i < dim; i++) {
            for(int j = 0; j < dim; j++) {
                lab[i][j] = new Cell(CellVal.empty,new Position(i,j));
            }
        }
        this.edge2distance = new HashMap<>();
        this.dim = dim;
        this.graphNeighbours = new ArrayList<>();
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


    public Map<Pair<Integer, Integer>, Integer> getEdge2distance() {
        return edge2distance;
    }

    public void setEdge2distance(Map<Pair<Integer, Integer>, Integer> edge2distance) {
        this.edge2distance = edge2distance;
    }

    public Position getEndPos() {
        return endPos;
    }

    public int getDim() {
        return dim;
    }

    Cell getCellById(int id){
        return graphNeighbours.get(id);
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

    public void createGraph() {
        int id = 0;
        for (int i = 0; i < this.getDim(); i++)
            for (int j = 0; j < this.getDim(); j++)
                if (this.getCell(i, j).getValue() != CellVal.wall) {
                    this.getCell(i, j).setId(id++);
                    this.graphNeighbours.add(this.getCell(i, j));
                }


        for (int i = 0; i < this.getDim(); i++) {
            for (int j = 0; j < this.getDim(); j++) {
                if (this.getCell(i, j).getValue() == CellVal.wall)
                    continue;

                if (i - 1 >= 0 && j - 1 >= 0)
                    if (this.getCell(i - 1, j - 1).getValue() != CellVal.wall){
                        this.getCell(i, j).addNeighbours(this.getCell(i - 1, j - 1));
                    Pair<Integer, Integer> edge = new Pair<>(this.getCell(i, j).getId(), this.getCell(i - 1, j - 1).getId());
                    this.getEdge2distance().put(edge, 1);
                }

                if (i >= 0 && j - 1 >= 0)
                    if (this.getCell(i, j - 1).getValue() != CellVal.wall){
                        this.getCell(i, j).addNeighbours(this.getCell(i, j - 1));
                    Pair<Integer, Integer> edge = new Pair<>(this.getCell(i, j).getId(), this.getCell(i, j - 1).getId());
                    this.getEdge2distance().put(edge, 1);
                }

                if (i + 1 >= 0 && j - 1 >= 0 && j - 1 <= this.getDim() - 1 && i + 1 <= this.getDim() - 1)
                    if (this.getCell(i + 1, j - 1).getValue() != CellVal.wall){
                        this.getCell(i, j).addNeighbours(this.getCell(i + 1, j - 1));
                    Pair<Integer, Integer> edge = new Pair<>(this.getCell(i, j).getId(), this.getCell(i + 1, j - 1).getId());
                    this.getEdge2distance().put(edge, 1);
                }

                if (i + 1 <= this.getDim() - 1 && j <= this.getDim() - 1 && i + 1 >= 0 && j >= 0)
                    if (this.getCell(i + 1, j).getValue() != CellVal.wall){
                        this.getCell(i, j).addNeighbours(this.getCell(i + 1, j));
                    Pair<Integer, Integer> edge = new Pair<>(this.getCell(i, j).getId(), this.getCell(i + 1, j).getId());
                    this.getEdge2distance().put(edge, 1);
                }

                if (i + 1 <= this.getDim() - 1 && j + 1 <= this.getDim() - 1 && i + 1 >= 0 && j + 1 >= 0)
                    if (this.getCell(i + 1, j + 1).getValue() != CellVal.wall){
                        this.getCell(i, j).addNeighbours(this.getCell(i + 1, j + 1));
                    Pair<Integer, Integer> edge = new Pair<>(this.getCell(i, j).getId(), this.getCell(i + 1, j + 1).getId());
                    this.getEdge2distance().put(edge, 1);
                }

                if (i <= this.getDim() - 1 && j + 1 <= this.getDim() - 1 && i >= 0 && j >= 0)
                    if (this.getCell(i, j + 1).getValue() != CellVal.wall){
                        this.getCell(i, j).addNeighbours(this.getCell(i, j + 1));
                    Pair<Integer, Integer> edge = new Pair<>(this.getCell(i, j).getId(), this.getCell(i, j + 1).getId());
                    this.getEdge2distance().put(edge, 1);
                }

                if (i - 1 <= this.getDim() - 1 && j + 1 <= this.getDim() - 1 && i - 1 >= 0 && j + 1 >= 0)
                    if (this.getCell(i - 1, j + 1).getValue() != CellVal.wall){
                        this.getCell(i, j).addNeighbours(this.getCell(i - 1, j + 1));
                    Pair<Integer, Integer> edge = new Pair<>(this.getCell(i, j).getId(), this.getCell(i - 1, j + 1).getId());
                    this.getEdge2distance().put(edge, 1);
                }

                if (i - 1 >= 0 && j >= 0 && i - 1 <= this.getDim() - 1 && j <= this.getDim() - 1)
                    if (this.getCell(i - 1, j).getValue() != CellVal.wall){
                        this.getCell(i, j).addNeighbours(this.getCell(i - 1, j));
                    Pair<Integer, Integer> edge = new Pair<>(this.getCell(i, j).getId(), this.getCell(i - 1, j).getId());
                    this.getEdge2distance().put(edge, 1);
                }
            }
        }
    }

    public void printLab(){
        System.out.println();
        for(int i = 0; i < endPos.getX()+1; i++) {
            System.out.println();
            for(int j = 0; j < endPos.getX()+1; j++) {
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

    public abstract void printNeighboursNumber();

    public abstract void printIds();

}
