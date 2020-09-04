package code.programers.level.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlterKey {
    int[] remained;
    int[] removed;
    int[] will;

    Map<String, Integer> map = new HashMap<String, Integer>();
    boolean flag;
    Map<Integer, Integer> remained_map = new HashMap<Integer, Integer>();

    boolean isUnique(String key)
    {
        return map.get(key) == null;
    }

    int[][] combination(int[] list, int[][] target)
    {
        List<int[]> result = new ArrayList<int[]>();

        for(int[] dimension:target)
        {
            if(dimension[0] < list[list.length-(dimension.length)])
            {
                for(int index=0; index<list.length; index++)
                {
                    int max= dimension[dimension.length-1];

                    if(list[index] > max)
                    {
                        int[] buffer = new int[dimension.length+1];
                        int size=0;
                        for(int value:dimension)
                        {
                            buffer[size++] = value;
                        }
                        buffer[size] = list[index];
                        result.add(buffer);
                    }
                }
            }
        }

        return result.toArray(new int[0][]);
    }

    int[] columns(int length)
    {
        int[] result = new int[length];
        for(int index=0; index< length; index++)
        {
            result[index] = index;
        }

        return result;
    }

    int[][] dimension(int[] list)
    {
        int[][] result = new int[list.length][1];

        int index=0;
        for(int number:list)
        {
            result[index++][0] = number;
        }

        return result;
    }
}