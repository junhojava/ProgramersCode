package code.programers.level.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    int minLength(String s)
    {
        int result = s.length();

        for(int index=1; index<s.length()/2 +1; index++)
        {
            List<String> string_list = splitAt(s, index, s.length());

            if(isRemained(s.length(), index))
            {
                int value = s.length()%index;
                string_list.add(s.substring(s.length()-value, s.length()));
            }

            int count = 1;

            Map<String, Integer> map = new HashMap<String, Integer>();

            String tmp = "";

            for(int idx=0; idx< string_list.size() -1; idx++)
            {
                if(isSameString(string_list.get(idx), string_list.get(idx+1)))
                {
                    count++;
                    map.put(string_list.get(idx), count);
                }
                else
                {
                    if(count== 1)
                    {
                        tmp += string_list.get(idx);
                    }else
                    {
                        tmp += count+string_list.get(idx);
                    }
                    count = 1;
                    map.remove(string_list.get(idx));
                    map.put(string_list.get(idx+1), count);
                }
            }

            if(!map.isEmpty())
            {
                for(Map.Entry<String, Integer> entry: map.entrySet())
                {
                    if(entry.getValue().equals(1))
                    {
                        tmp += entry.getKey();
                    }else
                    {
                        tmp += entry.getValue() + entry.getKey();
                    }
                }
            }
            if(tmp.length()<result) 
                result = tmp.length();

        }

        return result;
    }
}