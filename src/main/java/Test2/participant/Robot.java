package Test2.participant;

public class Robot extends Participant {


    public Robot(String name, int runPossibility, int jumpPossibility) {
        super(name, runPossibility, jumpPossibility);
    }


    @Override
    public int run() {
        return getRunPossibility();

    }

    @Override
    public int jump() {
        return getJumpPossibility();

    }


}
