package code.programers.level.one;

import java.util.Arrays;

public class IndexNumber {
    
    int length(int start, int end)
    {
        return end - start;
    }

    int[] split(int[] list, int start, int end)
    {
        return Arrays.copyOfRange(list, start-1, end);
    }

    int[] sort(int[] list)
    {
        Arrays.sort(list);

        return list;
    }
}