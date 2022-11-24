package Test2.barrier;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Result {
    private final boolean isOvercome;
    private final int barrierValue;
}
