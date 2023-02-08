import java.util.ArrayList;

public class GraphLab extends Graph{

    Cell[][] lab;

    int dim;

    GraphLab(Cell[][] lab,int dim){
        super();
        this.lab = lab;
        this.dim = dim;
    }


    @Override
    public void graphGen(){
        int id = 0;
        for (int i = 0; i < this.dim; i++)
            for (int j = 0; j < this.dim; j++)
                if (this.lab[i][j].getValue() != CellVal.wall) {
                    this.lab[i][j].setId(id++);
                    this.addNode(lab[i][j]);
                }



        for (int i = 0; i < this.dim; i++) {
            for (int j = 0; j < this.dim; j++) {
                if (this.lab[i][j].getValue() == CellVal.wall)
                    continue;

                 if (i - 1 >= 0 && j - 1 >= 0)
                    if (this.lab[i-1][j-1].getValue() != CellVal.wall)
                        this.addEdge(this.lab[i][j].getId(), this.lab[i-1][j-1].getId());


                 if (j - 1 >= 0)
                    if (this.lab[i][j-1].getValue() != CellVal.wall)
                        this.addEdge(this.lab[i][j].getId(), this.lab[i][j-1].getId());


                 if (j - 1 >= 0 && j - 1 <= this.dim - 1 && i + 1 <= this.dim - 1)
                    if (this.lab[i+1][j-1].getValue() != CellVal.wall)
                        this.addEdge(this.lab[i][j].getId(), this.lab[i+1][j-1].getId());


                 if (i + 1 <= this.dim - 1 && j <= this.dim - 1)
                    if (this.lab[i+1][j].getValue() != CellVal.wall)
                        this.addEdge(this.lab[i][j].getId(), this.lab[i+1][j].getId());


                 if (i + 1 <= this.dim - 1 && j + 1 <= this.dim - 1)
                    if (this.lab[i+1][j+1].getValue() != CellVal.wall)
                        this.addEdge(this.lab[i][j].getId(),this.lab[i+1][j+1].getId());


                 if (i <= this.dim - 1 && j + 1 <= this.dim - 1)
                    if (lab[i][j+1].getValue() != CellVal.wall)
                        this.addEdge(this.lab[i][j].getId(), this.lab[i][j+1].getId());


                 if (i - 1 <= this.dim - 1 && j + 1 <= this.dim - 1 && i - 1 >= 0)
                    if (lab[i-1][j+1].getValue() != CellVal.wall)
                        this.addEdge(this.lab[i][j].getId(), this.lab[i-1][j+1].getId());


                 if (i - 1 >= 0 && i - 1 <= this.dim - 1 && j <= this.dim - 1)
                    if (lab[i-1][j].getValue() != CellVal.wall)
                        this.addEdge(this.lab[i][j].getId(), this.lab[i-1][j].getId());

            }
        }
    }
}
