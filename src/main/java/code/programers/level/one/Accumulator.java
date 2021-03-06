package code.programers.level.one;

import java.util.Arrays;

public class Accumulator {
    Accumulator()
    {

    }

    void sortLongArray(long[] longArray)
    {
        Arrays.sort(longArray);
    }

    long sumBetweenTwoNumbers(long min, long max)
    {
        return (max - min +1) * (min + max) / 2;
    }

}