package Test2.participant;

import lombok.Getter;

public abstract class Participant implements IAction {
    @Getter
    private final String name;
    private final int runPossibility;
    private final int jumpPossibility;


    public Participant(String name, int runPossibility, int jumpPossibility) {
        this.name = name;
        this.runPossibility = runPossibility;
        this.jumpPossibility = jumpPossibility;
    }


    public int getRunPossibility() {
        return runPossibility;
    }

    public int getJumpPossibility() {
        return jumpPossibility;
    }
}
