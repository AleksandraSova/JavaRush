package Main.Lesson01;

public abstract class Participants {

    private String name;
    private int maxRange;
    private int maxJump;

    public Participants (String name, int maxRange, int maxJump) {
        this.maxRange = maxRange;
        this.maxJump = maxJump;
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int getMaxRange() {
        return maxRange;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public abstract void runTreadmill(Treadmill treadmill);
    public abstract void jumpWall(Wall wall);

}
