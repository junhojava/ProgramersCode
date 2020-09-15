package code.programers.level.one;

import java.util.ArrayList;
import java.util.List;

public class CreateString {

    String[] split(String str)
    {
        List<String> list = new ArrayList<String>();
        String s= "";
        for(int index=0; index<str.length(); index++)
        {
            s += str.substring(index, index+1);

            if(s.contains(" "))
            {
                list.add(s);
                s = "";
            }
        }

        if(!s.equals(""))
            list.add(s);

        return list.toArray(new String[0]);
    }

    String changeCase(String str)
    {
        String result = "";
        int number = -1;
        for(int index=0; index<str.length(); index++)
        {
            String s = str.substring(index, index+1);

            if(s.matches("[a-z]") || s.matches("[A-Z]"))
            {
                number++;

                if(number % 2 == 0)
                    result += s.toUpperCase();
                else
                    result += s.toLowerCase();
            }
            else
                result += s;
        }

        return result;
    }
}