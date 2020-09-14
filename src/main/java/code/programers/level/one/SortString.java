package code.programers.level.one;

import java.util.Arrays;

public class SortString {
    
    String[] substring(String[] list, int position)
    {
        for(int index=0; index<list.length;index++)
        {
            list[index] = list[index].substring(position);
        }

        return list;
    }

    String[] sort(String[] list)
    {
        Arrays.sort(list);

        return list;
    }
}