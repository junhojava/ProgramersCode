package code.programers.level.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlterKey {
    Map<String, Integer> attribute = new HashMap<String, Integer>();
    boolean flag = true;
    int[][] list;
    
    boolean isUnique(String key)
    {
        return attribute.get(key) == null;
    }

    void putKey(String key)
    {
        attribute.put(key, 1);
    }

    void clear()
    {
        flag = true;
        attribute.clear();
    }

    int isZero(int[] numbers, int row)
    {
        int result = 0;
        for(int index = 0; index< list.length; index++)
        {
            if(numbers[index] == 0)
            {
                for(int pair = 0; pair<numbers.length; pair++)
                {
                    if(pair != row)
                    {
                        list[pair][index] = 1;
                    }
                    else
                    {
                        list[pair][index] = 0;
                    }
                }
                result++;
            }
        }
        return result;
    }
}