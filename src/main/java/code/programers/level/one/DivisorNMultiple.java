package code.programers.level.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DivisorNMultiple {

    List<Integer> divisorList(int number)
    {
        List<Integer> list = new ArrayList<Integer>();

        for(int index=1; index<=number; index++)
            if((number % index) == 0)
                list.add(index);

        return list;
    }

    List<Integer> commonDivisor(List<Integer> list1, List<Integer> list2)
    {
        List<Integer> list = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int number:list1)
            map.put(number, map.getOrDefault(number, 0) +1);

        for(int number:list2)
            map.put(number, map.getOrDefault(number, 0) +1);

        for(Entry<Integer, Integer> entry: map.entrySet())
            if(entry.getValue() > 1)
                list.add(entry.getKey());

        return list;
    }
}