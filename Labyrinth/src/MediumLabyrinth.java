public class MediumLabyrinth implements ILabyrinth{
    private Cell[][] lab;
    private Position startPos;
    private Position endPos;

    public MediumLabyrinth(){

        lab = new Cell[8][8];
        this.startPos = new Position(0,0);
        this.endPos = new Position(8,8);

        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                lab[i][j] = new Cell();
            }
        }
    }

    @Override
    public void generateLab() {
        //
    }
}
