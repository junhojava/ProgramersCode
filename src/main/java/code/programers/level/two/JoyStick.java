package code.programers.level.two;

import java.util.HashMap;
import java.util.Map;

public class JoyStick {
    Map<String, Integer> keys;
    String word;

    JoyStick()
    {
        keys = new HashMap<>();

        char alphabet = "A".charAt(0);

        keys.put(Character.toString(alphabet++), 0);

        for(int index=1; index< 14; index++)
        {
            keys.put(Character.toString(alphabet++), index%14);
        }

        for(int index=12; index> 0; index--)
        {
            keys.put(Character.toString(alphabet++), index%14);
        }
    }

    void create(int count)
    {
        StringBuilder sb = new StringBuilder();
        for(int index=0; index< count; index++)
        {
            sb.append("A");
        }

        word = sb.toString();
    }

    int vertical(String str)
    {
        int number = 0;

        for(int index=0; index< str.length(); index++)
        {
            number += keys.get(str.substring(index, index+1));
        }

        return number;
    }

    int[] distance(String str, int start)
    {
        // 0 : left, 1: right
        int[] stickArray = {0, 0};
        int[] indexArray = {start, start};
        boolean[] checkedArray = {true, true};

        while(checkedArray[0] || checkedArray[1])
        {
            if(checkedArray[0])
            {
                if(indexArray[0]-1 < 0)
                    indexArray[0] = str.length()-1;
                else
                    indexArray[0]--;

                stickArray[0]++;

                if(keys.get(str.substring(indexArray[0], indexArray[0]+1)) > 0)
                    checkedArray[0] = false;

            }

            if(checkedArray[1])
            {
                if(indexArray[1] == str.length()-1)
                    indexArray[1] = 0;
                else
                    indexArray[1]++;

                stickArray[1]++;

                if(keys.get(str.substring(indexArray[1], indexArray[1]+1)) > 0)
                    checkedArray[1] = false;
            }
        }

        if(stickArray[0] < stickArray[1])
            return new int[]{stickArray[0], indexArray[0]};
        else
            return new int[]{stickArray[1], indexArray[1]};
    }
}