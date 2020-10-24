package code.programers.level.two;

import java.util.Arrays;
import java.util.Collections;

public class HIndex
{
    int[] sort(int[] citation)
    {
        return Arrays.stream(citation).boxed()
                     .sorted(Collections.reverseOrder())
                     .mapToInt(Integer::intValue)
                     .toArray();
    }

    int index(int[] citation)
    {
        int idx = 1;

        for(int number: citation)
            if(idx > number)
                break;
            else
                idx++;

        return idx-1;
    }
}