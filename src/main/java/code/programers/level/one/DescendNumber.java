package code.programers.level.one;

import java.util.Arrays;
import java.util.Collections;

public class DescendNumber {

    String[] sort(String[] list, String type)
    {
        if(type.equals("asc"))
            Arrays.sort(list);
        else if(type.equals("desc"))
            Arrays.sort(list, Collections.reverseOrder());

        return list;
    }

    long parseLong(String[] list)
    {
        String result = "";

        for(String str: list)
        {
            result += str;
        }

        return Long.parseLong(result);
    }
}