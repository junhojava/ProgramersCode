package code.programers.level.one;

import java.util.Arrays;

public class Accumulator {
    Accumulator()
    {

    }

    long sumBetweenTwoNumbers(long min, long max)
    {
        return (max - min +1) * (min + max) / 2;
    }

}