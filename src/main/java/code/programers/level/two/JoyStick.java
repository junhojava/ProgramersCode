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
        int right= 0;
        int left= 0;
        int leftIndex= start;
        int rightIndex= start;
        boolean leftChecked= true;
        boolean rightChecked = true;

        while(leftChecked || rightChecked)
        {
            if(rightIndex == str.length())
                rightIndex = 0;

            if(leftIndex == 0)
                leftIndex = str.length()-1;

            if(leftChecked)
            {
                left++;

                if(keys.get(str.substring(left-1, left)) > 0)
                    leftChecked = false;
                else
                    leftIndex++;
            }

            if(rightChecked)
            {
                right++;

                if(keys.get(str.substring(right, right+1)) > 0)
                    rightChecked = false;
                else
                    rightIndex++;
            }
        }

        if(left > right)
        {
            return new int[]{right, rightIndex};
        }
        else
        {
            return new int[]{left, leftIndex};
        }
    }
}