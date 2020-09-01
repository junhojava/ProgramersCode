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

    int stringToInt(String left)
    {
        return Integer.parseInt(left);
    }

    String concatString(String left, String right, int number)
    {
        if(number > 1)
        {
            return left+number+right;
        }
        else
        {
            return left+right;
        }
    }

    String compresString(String s, int number)
    {
        String[] list = splitedList(s, number);
        String result = "";

        if(number > 1)
        {
            int begin = 0;
            if(remained(s.length(), number))
            {
                begin = s.length() - s.length()%number;
            }
            else
            {
                begin = s.length()-number;
            }
            
            list = concatList(list, s.substring(begin ,s.length()));
        }

        int count = 1;
            for(int index=0; index+1<list.length; index++)
            {
                String crnt = list[index];
                String next = list[index+1];
                if(equalsString(crnt, next))
                {
                    count++;
                }
                else
                {
                    result = concatString(result, crnt, count);

                    count = 1;
                }
                list[index] = "";
            }

            if(!equalsString(list[list.length-1], ""))
            {
                result = concatString(result, list[list.length-1], count);
            }

            return result;
    }
}