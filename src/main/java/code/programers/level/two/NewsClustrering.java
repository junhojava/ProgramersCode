package code.programers.level.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NewsClustrering {

    String[] multiCombination(String str)
    {
        List<String> result = new ArrayList<String>();

        for(int index=0; index< str.length()-1; index++)
        {
            String factor = str.substring(index, index+2).toUpperCase();

            if(isEnglish(factor))
            {
                result.add(factor);
            }
        }

        return result.toArray(new String[0]);
    }

    boolean isEnglish(String str)
    {
        return str.matches("^[a-zA-Z]*$");
    }

    Map<String, Integer> countKey(String[] list)
    {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for(String str:list)
            result.put(str, result.getOrDefault(str, 0) + 1);

        return result;
    }

    int intersection(Map<String, Integer>map1, Map<String,Integer>map2)
    {
        int result = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(Entry<String, Integer> entry: map1.entrySet())
            if(map2.get(entry.getKey())!= null)
                map.put(entry.getKey(), Math.min(entry.getValue(), map2.get(entry.getKey())));

        for(Entry<String, Integer> entry: map2.entrySet())
            if(map1.get(entry.getKey())!= null)
                map.put(entry.getKey(), Math.min(entry.getValue(), map1.get(entry.getKey())));

        for(Entry<String, Integer> entry: map.entrySet())
            result += (double) entry.getValue();

        return result;
    }

    int union(Map<String, Integer>map1, Map<String,Integer>map2)
    {
        int result = 0;
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(Entry<String, Integer> entry: map1.entrySet())
            if(map2.get(entry.getKey())!= null)
                map.put(entry.getKey(), Math.max(entry.getValue(), map2.get(entry.getKey())));
            else
                map.put(entry.getKey(), entry.getValue());

        for(Entry<String, Integer> entry: map2.entrySet())
            if(map1.get(entry.getKey())!= null)
                map.put(entry.getKey(), Math.max(entry.getValue(), map1.get(entry.getKey())));
            else
                map.put(entry.getKey(), entry.getValue());

        for(Entry<String, Integer> entry: map.entrySet())
            result += (double) entry.getValue();

        return result;
    }

    boolean isZero(String[] list)
    {
        int count = 0;
        for(String str:list)
            if(!str.equals(""))
                count++;

        return count == 0;
    }
}