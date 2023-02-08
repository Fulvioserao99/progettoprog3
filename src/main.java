public class main {

    public static void main(String[] args) throws InterruptedException {

        Game instance = new Game("romano","pertosi",1);
        ExampleSub example = new ExampleSub();
        instance.subscribe(example);
        instance.notifySubscribers();
        example.printLabRobot();
        int steps = 0;
        while (true){
            Thread.sleep(1000);
            steps++;
            instance.updateCells();
            instance.move();
            instance.notifySubscribers();
            example.printLabRobot();
            if (instance.getRobotPos() == instance.goal())
                break;
        }
        System.out.println();
        System.out.println();
        System.out.println("Hai raggiunto la soluzione in " + steps + " passi!");





    }

}
