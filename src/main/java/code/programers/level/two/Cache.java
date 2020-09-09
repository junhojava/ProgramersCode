package code.programers.level.two;

import java.util.Map;

public class Cache {

    String[] buffer;
    int size;
    Map<String, Integer> map;
    int time;

    boolean isZero()
    {
        return size == 0;
    }

    void put(String str)
    {
        if(!isFull())
        {
            map.put(str, 1);
        }
        else
        {
            if(map.get(buffer[0]) == 1)
                map.remove(buffer[0]);
            else
                map.put(buffer[0], map.get(buffer[0]) -1);

            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for(int index=1; index < size; index++)
        {
            buffer[index-1] = buffer[index];
        }

        buffer[size-1] = str;
    }

    boolean isFull()
    {
        boolean result = true;

        for(String str: buffer)
            if(str == null)
                return false;

        return result;
    }

    boolean isHit(String str)
    {
        return map.get(str) != null;
    }

    int position(String str)
    {
        int result = 0;
        for(int index=0; index < size; index++)
            if(buffer[index] != null)
                if(buffer[index].equals(str))
                    return index;

        return result;
    }

    void shift(int number, String str)
    {
        for(int index = number; index < size-1; index++)
        {
            buffer[index] = buffer[index+1];
        }

        buffer[size-1] = str;
    }
}