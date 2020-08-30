package code.programers.level.one;

public class Accumulator {
    Accumulator()
    {

    }

    int[] diffMinMax(int left, int right)
    {
        int[] result = new int[2];
        if(left < right)
        {
            result[0] = left;
            result[1] = right;
        }else
        {
            result[1] = left;
            result[0] = right;
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

    int sumMinToMax(int[] pair)
    {
        int result = 0;
        for(int index = pair[0]; index <= pair[1]; index++)
        {
            result += index;
        }
        return result;
    }
}