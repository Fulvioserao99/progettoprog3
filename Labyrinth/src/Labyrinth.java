public class Labyrinth {

    private Cell[][] lab;
    private Position startPos;
    private Position endPos;

    public Labyrinth(){

        lab = new Cell[16][16];
        this.startPos = new Position(0,0);
        this.endPos = new Position(16,16);

        for(int i = 0; i < 16; i++) {
            for(int j = 0; j < 16; j++) {
                lab[i][j] = new Cell();
            }
        }
    }
}
