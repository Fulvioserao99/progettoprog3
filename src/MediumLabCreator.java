public class MediumLabCreator extends LabCreator{
    /**
     *
     * @return labirinto
     */
    @Override
    public ILabyrinth createLab() {
        MediumLabyrinth lab =  new MediumLabyrinth();
        lab.generateLab();
        lab.createGraph();
        return lab;
    }
}
