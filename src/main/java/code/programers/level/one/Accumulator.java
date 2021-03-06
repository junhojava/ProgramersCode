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

    boolean numberEquals(int left, int right)
    {
        boolean result;

        if(left == right)
        {
            result = true;
        }
        else
        {
            result = false;
        }

        return result;
    }

    long sumBetweenMinToMax(long min, long max)
    {
        return (max - min +1) * (min + max) / 2;
    }

}