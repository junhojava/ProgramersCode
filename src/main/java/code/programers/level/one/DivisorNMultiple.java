package code.programers.level.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DivisorNMultiple {

    List<Integer> divisorList(int number)
    {
        List<Integer> list = new ArrayList<>();

        for(int index=1; index<=number; index++)
            if((number % index) == 0)
                list.add(index);

        return list;
    }

    List<Integer> commonDivisor(List<Integer> list1, List<Integer> list2)
    {
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int number:list1)
            map.put(number, map.getOrDefault(number, 0) +1);

        for(int number:list2)
            map.put(number, map.getOrDefault(number, 0) +1);

        for(Entry<Integer, Integer> entry: map.entrySet())
            if(entry.getValue() > 1)
                list.add(entry.getKey());

        return list;
    }

    int biggestCommonDivisor(List<Integer> list)
    {
        int result = 0;

        for(int number:list)
            if(result < number)
                result = number;

        return result;
    }

    List<Integer> multipleList(int number)
    {
        List<Integer> result = new ArrayList<>();

        for(int index= 1; index*number<= 20; index++)
            result.add(index*number);
        // 1000000

        return result;
    }

    List<Integer> commonMultiple(List<Integer> list1, List<Integer> list2)
    {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int number: list1)
            map.put(number, 1);

        for(int number: list2)
            map.put(number, map.getOrDefault(number, 0) +1);

        for(Entry<Integer, Integer> entry: map.entrySet())
            if(entry.getValue() > 1)
                result.add(entry.getKey());

        return result;
    }
}