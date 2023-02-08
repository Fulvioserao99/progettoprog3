import java.util.ArrayList;

public class Graph{

    Cell[][] lab;
    MultiMap<Integer, Integer> edges;
    ArrayList<Cell> nodes;

    int dim;

    Graph(Cell[][] lab,int dim){
        this.lab = lab;
        this.edges = new MultiMap<>();
        this.nodes = new ArrayList<>();
        this.dim = dim;
    }

    void addEdge(Integer source, Integer dest){
        this.edges.put(source,dest);
    }

    MultiMap<Integer, Integer> getEdges(){
        return this.edges;
    }

    void addNode(Cell node){
        this.nodes.add(node);
    }

    Cell getNode(int index){
        return this.nodes.get(index);
    }

    public void graphGen(){
        int id = 0;
        for (int i = 0; i < this.dim; i++)
            for (int j = 0; j < this.dim; j++)
                if (this.lab[i][j].getValue() != CellVal.wall) {
                    this.lab[i][j].setId(id++);
                    this.nodes.add(lab[i][j]);
                }



        for (int i = 0; i < this.dim; i++) {
            for (int j = 0; j < this.dim; j++) {
                if (this.lab[i][j].getValue() == CellVal.wall)
                    continue;

                 if (i - 1 >= 0 && j - 1 >= 0)
                    if (this.lab[i-1][j-1].getValue() != CellVal.wall)
                        this.edges.put(this.lab[i][j].getId(), this.lab[i-1][j-1].getId());


                 if (j - 1 >= 0)
                    if (this.lab[i][j-1].getValue() != CellVal.wall)
                        this.edges.put(this.lab[i][j].getId(), this.lab[i][j-1].getId());


                 if (j - 1 >= 0 && j - 1 <= this.dim - 1 && i + 1 <= this.dim - 1)
                    if (this.lab[i+1][j-1].getValue() != CellVal.wall)
                        this.edges.put(this.lab[i][j].getId(), this.lab[i+1][j-1].getId());


                 if (i + 1 <= this.dim - 1 && j <= this.dim - 1)
                    if (this.lab[i+1][j].getValue() != CellVal.wall)
                        this.edges.put(this.lab[i][j].getId(), this.lab[i+1][j].getId());


                 if (i + 1 <= this.dim - 1 && j + 1 <= this.dim - 1)
                    if (this.lab[i+1][j+1].getValue() != CellVal.wall)
                        this.edges.put(this.lab[i][j].getId(),this.lab[i+1][j+1].getId());


                 if (i <= this.dim - 1 && j + 1 <= this.dim - 1)
                    if (lab[i][j+1].getValue() != CellVal.wall)
                        this.edges.put(this.lab[i][j].getId(), this.lab[i][j+1].getId());


                 if (i - 1 <= this.dim - 1 && j + 1 <= this.dim - 1 && i - 1 >= 0)
                    if (lab[i-1][j+1].getValue() != CellVal.wall)
                        this.edges.put(this.lab[i][j].getId(), this.lab[i-1][j+1].getId());


                 if (i - 1 >= 0 && i - 1 <= this.dim - 1 && j <= this.dim - 1)
                    if (lab[i-1][j].getValue() != CellVal.wall)
                        this.edges.put(this.lab[i][j].getId(), this.lab[i-1][j].getId());

            }
        }
    }
}
