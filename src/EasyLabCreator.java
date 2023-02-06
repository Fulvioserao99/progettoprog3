public class EasyLabCreator extends LabCreator{
    @Override
    public ILabyrinth createLab() {
        EasyLabyrinth lab =  new EasyLabyrinth();
        lab.generateLab();
        lab.createGraph();
        return lab;
    }
}
