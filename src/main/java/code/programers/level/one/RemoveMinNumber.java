package code.programers.level.one;

import java.util.Arrays;

public class RemoveMinNumber {
    
    int min(int[] list)
    {
        int[] copy = Arrays.copyOf(list, list.length);

        Arrays.sort(copy);

        return copy[0];
    }

    boolean findMin(int left, int right)
    {
        return left == right;
    }

    int[] removeMin()
    {
        return new int[0];
    }
}