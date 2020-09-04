package code.programers.level.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlterKey {
    Map<String, Integer> attribute = new HashMap<String, Integer>();
    boolean flag = true;
    Map<Integer, String> list = new HashMap<Integer, String>();
    int count;
    
    boolean isUnique(String key)
    {
        return attribute.get(key) == null;
    }

    int[][] combination(int[] list, int count)
    {
        List<int[]> result = new ArrayList<int[]>();
        int max = list[list.length-1];
        int min = list[0];
        int next = list[1];

        for(int index=0; index<list.length-1;index++)
        {
            for(int inner = index+1; inner<list.length; inner++)
            {
                result.add(new int[]{list[index], list[inner]});
            }
        }

        return result.toArray(new int[0][]);
    }

    int[][] tripleCombination(int[] list)
    {
        List<int[]> result = new ArrayList<int[]>();
        List<int[]> sample = new ArrayList<int[]>();

        sample.add(new int[]{1,2});
        sample.add(new int[]{1,3});
        sample.add(new int[]{1,4});
        sample.add(new int[]{2,3});
        sample.add(new int[]{2,4});
        sample.add(new int[]{3,4});
        
        for(int[] dimension:sample)
        {
            if(dimension[0] < list[list.length-2])
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
}