package code.programers.level.one;

import java.util.Arrays;
import java.util.Collections;

public class DescendSortString {
    
    String[] split(String s)
    {
        String[] result = new String[2];

        result[0] = s.replaceAll("[A-Z]", "");
        result[1] = s.replaceAll("[a-z]", "");

        return result;
    }

    String sort(String s)
    {
        String[] list = s.split("");
        String result = "";

        Arrays.sort(list, Collections.reverseOrder());

        for(String str:list)
            result+= str;

        return result;
    }
}