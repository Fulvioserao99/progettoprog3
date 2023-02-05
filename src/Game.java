public class Game {

    private Labyrinth lab;

    private Robot robot;

    //file?

    Game(String nome, String cognome, int difficolta){


        switch(difficolta){

            case 1:
                this.lab = new EasyLabyrinth();
                break;

            case 2:
                this.lab = new MediumLabyrinth();
                break;
            case 3:
                this.lab = new HardLabyrinth();
                break;
        }
        this.robot = new Robot(nome,cognome,lab.getCell(0,0));

    }

}
