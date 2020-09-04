package code.programers.level.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AlterKey {
    int[] remained;

    Map<String, Integer> map = new HashMap<String, Integer>();
    boolean flag;
    Map<Integer, Integer> remained_map = new HashMap<Integer, Integer>();
    List<String> keys = new ArrayList<String>();
    List<String> unique_key = new ArrayList<String>();

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

    int[] remove(int[] target, int[] list)
    {
        int[] result;
        int index=0;

        for(int number:target)
        {
            remained_map.put(number, 1);
        }

        for(int removed_number: list)
        {
            remained_map.remove(removed_number);
        }

        result = new int[remained_map.size()];

        for(Entry<Integer, Integer> entry: remained_map.entrySet())
        {
            result[index++] = entry.getKey();
        }

        return result;
    }

    void putKeys(int[] list)
    {
        String result = "";
        for(int number:list)
        {
            result += number;
        }
        keys.add(result);
    }

    int alterKey()
    {
        int min = keys.get(0).length();

        for(String s: keys)
        {
            if(s.length() == min)
            {
                unique_key.add(s);
            }
            else
            {
                isMini(s);
            }
        }

        return unique_key.size();
    }

    void isMini(String s)
    {
        boolean f = true;
        for(String diff: unique_key)
        {
            int length = diff.length();
            int count = 0;

            for(int index=0; index<length; index++)
            {
                String c = diff.substring(index, index+1);
                if(s.indexOf(c)>-1)
                {
                    count++;
                }
                
            }
            if(length == count)
            {
                f = false;
            }
        }
        if(f)
        {
            unique_key.add(s);
        }
    }

    public int solution(String[][] relation) {
        int count = 0;
        
        remained= columns(relation[0].length);

        int[][] combination = {{}};

        int round = 0;
        while(round < relation[0].length)
        {
            if(round == 0)
            {
                combination = dimension(remained);
            }
            else
            {
                combination = combination(remained, combination);
            }
            round++;
            for(int[] list: combination)
            {
                flag = true;
                for(String[] record:relation)
                {
                    String key = "";
                    for(int index: list)
                    {
                        key += record[index];
                    }
    
                    if(isUnique(key))
                    {
                        map.put(key, 1);
                    }
                    else
                    {
                        flag = false;
                    }
    
                }
                if(flag)
                {
                    count++;
                    putKeys(list);
                    // remained = remove(remained, list);
                }
    
                map.clear();
            }

        }
        return alterKey();
    }
}