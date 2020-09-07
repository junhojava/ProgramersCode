package code.programers.level.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class NewsClustrering {

    boolean isZero(String str)
    {
        return str.length() == 0;
    }

    String[] combination(String str)
    {
        String[] result = new String[str.length()-1];
        for(int index=0; index<str.length()-1; index++)
        {
            result[index] = str.substring(index, index+2);
        }

        return result;
    }

    boolean isEnglish(String str)
    {
        return str.matches("^[a-zA-Z]*$");
    }

    double sets(String[] list1, String[] list2)
    {
        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<String, Integer> list1_map = new HashMap<String, Integer>();
        Map<String, Integer> list2_map = new HashMap<String, Integer>();
        List<String> interSectionList = new ArrayList<String>();
        List<String> unionList = new ArrayList<String>();
        String key ="";

        for(String str1: list1)
        {
            if(isEnglish(str1))
            {
                if(list1_map.get(str1.toUpperCase())==null)
                {
                    list1_map.put(str1.toUpperCase(), 1);
                }
                else
                {
                    list1_map.put(str1.toUpperCase(), list1_map.get(str1.toUpperCase())+1);
                }

                if(map.get(str1.toUpperCase()) == null)
                {
                    map.put(str1.toUpperCase(), 1);
                }
                else
                {
                    map.put(str1.toUpperCase(), map.get(str1.toUpperCase())+1);
                }
            }
        }

        for(String str2: list2)
        {
            if(isEnglish(str2))
            {
                if(list2_map.get(str2.toUpperCase())==null)
                {
                    list2_map.put(str2.toUpperCase(), 1);
                }
                else
                {
                    list2_map.put(str2.toUpperCase(), list2_map.get(str2.toUpperCase())+1);
                }

                if(map.get(str2.toUpperCase()) == null)
                {
                    map.put(str2.toUpperCase(), 1);
                }
                else
                {
                    map.put(str2.toUpperCase(), map.get(str2.toUpperCase())+1);
                }
            }
        }

        for(Entry<String, Integer> entry: map.entrySet())
        {
            key = entry.getKey();
            unionList.add(entry.getKey());
            if(entry.getValue() > 1)
                interSectionList.add(entry.getKey());
        }

        if(map.size() == 1)
        {
            return jakard(list1_map.get(key), list2_map.get(key));
        }
        else
        {
            return jakard(interSectionList.size(), unionList.size());
        }
    }

    double jakard(int number1, int number2)
    {
        double result;
        if(number1 == 0 && number2 == 0)
        {
            result = 1;
        }
        else if(number1 == 0 || number2 ==0)
        {
            result = 0;
        }
        else
        {
            if(number2 > number1)
            {
                result =  (double)number1 / (double)number2;
            }
            else
            {
                result = (double)number2 / (double)number1;
            }
        }

        return result;
    }
}