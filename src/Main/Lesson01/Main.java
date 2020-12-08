package Main.Lesson01;

public class Main {

    public static void main(String[] args) {
        int Stage = 0;

        Participants[] participants = new Participants[3];
        participants[0] = new Cat("Один",1300, 3);
        participants[1] = new Human("Иван",4500, 2);
        participants[2] = new Robot("Бендер",39000, 13);

        Treadmill treadmill = new Treadmill(300);
        Wall wall = new Wall(2);


        playMarathon(participants, treadmill, wall);
    }


    public static void playMarathon(Participants[] participants, Treadmill treadmill, Wall wall) {
        int Stage;
        do {
            for ( Stage = 1; Stage <=3 ; Stage++) {
                treadmill.setRange(treadmill.getRange()*Stage);
                wall.setHeight(wall.getHeight()*Stage);
                for (int i = 0; i < 3; i++) {
                    if (participants[i].getMaxRange() < treadmill.getRange()){
                        continue;
                    }
                    participants[i].runTreadmill(treadmill);
                }
                for (int j = 0; j < 3; j++) {
                    if (participants[j].getMaxJump() < wall.getHeight()) {
                        continue;
                    }
                    participants[j].jumpWall(wall);
                }
                System.out.println("\n" + Stage + " препятсвие" + "\n");
            }
        } while (Stage == 3);
    }

}
