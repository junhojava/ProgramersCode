package code.programers.level.one;

public class Accumulator {
    Accumulator()
    {

    }

    long[] diffMinMax(int left, int right)
    {
        long[] result = new long[2];
        if(left < right)
        {
            result[0] = left;
            result[1] = right;
        }else
        {
            result[0] = right;
            result[1] = left;
        }

        return result;
    }

    boolean numberEquals(int left, int right)
    {
        if(left == right)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    long sumMinToMax(long min, long max)
    {
        return min - max;
    }

    long sumZeroToValue(long value)
    {
        return value * (value+1)/2;
    }
}