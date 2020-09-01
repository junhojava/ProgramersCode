package code.programers.level.two;

import java.util.ArrayList;
import java.util.List;

public class CompressString {
    
    boolean firstCharacterDuplication(String s)
    {
        boolean result = true;
        String c = s.substring(0,1);

        if(s.replaceAll(c, "").length() == s.length()-1)
        {
            result = false;
        }

        return result;
    }

    boolean isEven(int number)
    {
        boolean result = false;
        if(number%2 == 0)
        {
            result = true;
        }
        return result;
    }

    List<String> splitAt(String s, int number, int length)
    {
        List<String> result = new ArrayList<String>();

        for(int index=0; index<length/number; index++)
        {
            int value = index*number;

            result.add(s.substring(value, value+number));
        }

        return result;

    }

    boolean isRemained(int length, int number)
    {
        return (length%number) != 0;
    }

    boolean isSameString(String left, String right)
    {
        boolean result =false;

        if(left.equals(right))
        {
            result = true;
        }

        return result;
    }
}