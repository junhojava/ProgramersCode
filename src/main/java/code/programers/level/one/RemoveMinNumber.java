package code.programers.level.one;

import java.util.Arrays;

public class RemoveMinNumber {
    
    int min(int[] list)
    {
        int[] copy = Arrays.copyOf(list, list.length);

        Arrays.sort(copy);

        return copy[0];
    }
}