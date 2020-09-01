package code.programers.level.two;

import java.util.ArrayList;
import java.util.List;

public class CompressString {
    
    boolean only(String s, String c)
    {
        return s.replace(c, "").length() == s.length() - 1;
    }

    boolean remained(int left, int right)
    {
        return (left%right) != 0;
    }

    boolean equalsString(String left, String right)
    {
        return left.equals(right);
    }

    String[] splitedList(String s, int number)
    {
        List<String> list = new ArrayList<String>();

        for(int index=0; index+number< s.length(); index+=number)
        {
            String crnt = s.substring(index, index+number);

            list.add(crnt);
        }

        return list.toArray(new String[0]);
    }

    String[] concatList(String[] list, String str)
    {
        String[] result = new String[list.length+1];

        for(int index=0; index<list.length; index++)
        {
            result[index] = list[index];
        }

        result[result.length-1] = str;

        return result;
    }
}