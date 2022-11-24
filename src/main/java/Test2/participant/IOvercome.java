package Test2.participant;

import Test2.barrier.Result;

public interface IOvercome {
    Result overcome(Participant participant);
    String getBarrierName();
}
