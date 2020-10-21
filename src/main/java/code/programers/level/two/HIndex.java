package code.programers.level.two;

import java.util.Arrays;

public class HIndex
{
    void sort(int[] citation)
    {
        Arrays.sort(citation);
    }

    int index(int[] citation)
    {
        int idx = 1;
        int length = citation.length;

        for(int number: citation)
            if(idx > length- idx)
                break;
            else
                idx++;

        return idx;
    }
}