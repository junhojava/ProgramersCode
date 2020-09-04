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

    int[][] combination(int[] list, int count)
    {
        return new int[][]{{1,2},{1,3},{1,4},{2,3},{2,4},{3,4}};
    }
}