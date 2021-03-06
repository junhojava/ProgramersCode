package code.programers.level.one;

import java.util.Arrays;

public class ContinuedNumber {
    

    boolean isEquals(int left, int right)
    {
        return left == right;
    }

    int[] put(int[] list, int number)
    {
        list = Arrays.copyOf(list, list.length+1);

        list[list.length-1] = number;

        return list;
    }
}