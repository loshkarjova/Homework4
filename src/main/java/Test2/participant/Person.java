package Test2.participant;



public class Person extends Participant{

    public Person(String name, int runPossibility, int jumpPossibility) {
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
