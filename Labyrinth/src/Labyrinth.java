public abstract class Labyrinth implements ILabyrinth{

    private Cell[][] lab;
    private Position startPos;
    private Position endPos;
    public abstract void generateLab();


    public Labyrinth(int col, int rows){

        lab = new Cell[col][rows];
        startPos = new Position(0,0);
        endPos = new Position(col-1,rows-1);

        for(int i = 0; i < col; i++) {
            for(int j = 0; j < rows; j++) {
                lab[i][j] = new Cell(CellVal.empty,new Position(i,j));
            }
        }
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

    public void printLab(){
        for(int i = 0; i < endPos.getX()+1; i++) {
            System.out.println();
            for(int j = 0; j < endPos.getX()+1; j++) {
                System.out.print(lab[i][j].getValue());
            }
        }
    }
}
