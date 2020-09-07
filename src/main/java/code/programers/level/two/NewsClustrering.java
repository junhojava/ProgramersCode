package code.programers.level.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NewsClustrering {
    
    boolean isZero(String str)
    {
        return str.length() == 0;
    }

    String[] combination(String str)
    {
        String[] result = new String[str.length()-1];
        for(int index=0; index<str.length()-1; index++)
        {
            result[index] = str.substring(index, index+2);
        }

        return result;
    }

    boolean isEnglish(String str)
    {
        return str.matches("^[a-zA-Z]*$");
    }

    String[] interSection(String[] list1, String[] list2)
    {
        Map<String, Integer> map = new HashMap<String, Integer>();
        List<String> result = new ArrayList<String>();

        for(String str1: list1)
        {
            if(map.get(str1) == null)
            {
                map.put(str1, 1);
            }
            else
            {
                map.put(str1, map.get(str1)+1);
            }
        }

        for(String str2: list2)
        {
            if(map.get(str2) == null)
            {
                map.put(str2, 1);
            }
            else
            {
                map.put(str2, map.get(str2)+1);
            }
        }

        for(Entry<String, Integer> entry: map.entrySet())
        {
            if(entry.getValue() > 1)
                result.add(entry.getKey());
        }

        return result.toArray(new String[0]);
    }
}