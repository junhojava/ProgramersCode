package code.programers.level.two;

import java.util.HashMap;
import java.util.Map;

public class LeastCommonMultiple
{

    Map<Integer, Integer> map;

    LeastCommonMultiple()
    {
        map = new HashMap<>();
    }
    
    void factorization(int number)
    {
        for(int index = 2; number > 1;)
        {
            if(number % index == 0)
            {
                map.put(index, map.getOrDefault(index, 0)+1);
                number /= index;
            }
            else
                index++;
        }
    }
}