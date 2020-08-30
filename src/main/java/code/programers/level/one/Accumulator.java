package code.programers.level.one;

public class Accumulator {
    Accumulator()
    {

    }

    long[] diffMinMax(int left, int right)
    {
        if(left < right)
        {
            return new long[]{left, right};
        }else
        {
            return new long[]{right, left};
        }
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