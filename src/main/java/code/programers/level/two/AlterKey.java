package code.programers.level.two;

import java.util.HashMap;
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

    void putKey(String key)
    {
        attribute.put(key, 1);
    }

    void clear()
    {
        flag = true;
        attribute.clear();
    }

    void init(int length)
    {
        for(int index=0; index<length; index++)
        {
            list.put(index, ".");
        }
    }

    void listRemove(int[] indexs)
    {
        count++;
        for(int index:indexs)
        {
            list.remove(index);
        }
    }
}