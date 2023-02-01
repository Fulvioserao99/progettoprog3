public class EasyLabyrinth implements ILabyrinth{

    private Cell[][] lab;
    private Position startPos;
    private Position endPos;

    public EasyLabyrinth(){

        lab = new Cell[4][4];
        this.startPos = new Position(0,0);
        this.endPos = new Position(3,3);

        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                lab[i][j] = new Cell();
            }
        }
    }

    @Override
    public void generateLab() {

    }

    public Cell getCell(int x, int y){
        return lab[y][x];
    }
}
