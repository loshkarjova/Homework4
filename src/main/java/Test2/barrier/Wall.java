package Test2.barrier;

import Test2.participant.Participant;
import lombok.Getter;

public class Wall extends Barrier {

    @Getter
    private final int height;


    public Wall(int height) {
        super("Wall");
        this.height = height;

    }


    @Override
    public Result overcome(Participant participant) {
        int i = height - participant.jump();
        String name = participant.getName();
        return new Result(i > 0, participant.jump());
    }

    @Override
    public String getBarrierName() {
        return "Wall";
    }

}
