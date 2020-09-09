package code.programers.level.two;

import java.util.Map;

public class Cache {
    
    String[] buffer;
    int size;
    Map<String, Integer> map;

    boolean isZero()
    {
        return size == 0;
    }

    void put(String str)
    {
        for(int index=1; index < size; index++)
        {
            buffer[index-1] = buffer[index];
        }
        if(isFull())
        {
            map.put(str, 1);
        }
        else
        {
            if(map.get(buffer[0]) == 1)
                map.remove(buffer[0]);
            else
                map.put(buffer[0], map.get(buffer[0]) -1);

            map.put(str, map.getOrDefault(str, 1) + 1);
        }

        buffer[size-1] = str;
    }

    boolean isFull()
    {
        boolean result = true;

        for(String str: buffer)
            if(str.equals(""))
                return false;

        return result;
    }
}