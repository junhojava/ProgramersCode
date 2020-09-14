package code.programers.level.one;

import java.util.Arrays;

public class SortString {
    
    String[] substring(String[] list, int position)
    {
        String[] result = new String[list.length];

        for(int index=0; index<list.length;index++)
            result[index] = list[index].substring(position);

        return result;
    }

    String[] sort(String[] list)
    {
        Arrays.sort(list);

        return list;
    }

    boolean compare(String left, String right, int position)
    {
        return left.substring(position).equals(right);
    }
}