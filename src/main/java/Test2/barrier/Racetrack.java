package Test2.barrier;

import Test2.participant.Participant;
import lombok.Getter;

public class Racetrack extends Barrier {
    @Getter
    private final int length;


    public Racetrack(int length) {
        super("Racetrack");
        this.length = length;

    }

    @Override
    public Result overcome(Participant participant) {
        int i = length - participant.run();
        String name = participant.getName();
        return new Result(i > 0, participant.run());
    }

    @Override
    public String getBarrierName() {
        return "Racetrack";
    }
}
