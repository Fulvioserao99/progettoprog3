public interface ILabyrinth {
    public void generateLab();
    public Cell getCell(int x, int y);

    public void setCell(int x, int y, Cell cell);
    public void printLab();

    public void printNeighboursNumber();
}
