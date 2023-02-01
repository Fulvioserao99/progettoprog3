public class HardLabCreator extends LabCreator{
    @Override
    public ILabyrinth createLab() {
        HardLabyrinth lab =  new HardLabyrinth();
        lab.generateLab();
        return lab;
    }
}
