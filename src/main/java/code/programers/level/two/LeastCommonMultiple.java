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
        int count = 0;
        int index = 2;
        
        while(number > 1)
        {
            if(number % index == 0)
            {
                count++;
                number /= index;
            }
            else
            {
                if(count > 0)
                {
                    if(map.get(index) == null)
                        map.put(index, count);
                    else if(map.get(index) < count)
                        map.put(index, count);

                    count = 0;
                }

                    index++;
            }
        }

        if(count > 0)
            if(map.get(index) == null)
                map.put(index, count);
            else if(map.get(index) < count)
                map.put(index, count);
    }
}