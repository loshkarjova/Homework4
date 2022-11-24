package Test2.barrier;

import Test2.participant.IOvercome;

public abstract class Barrier implements IOvercome {

    private String name;

    public Barrier(String name) {
        this.name = name;
    }

}
