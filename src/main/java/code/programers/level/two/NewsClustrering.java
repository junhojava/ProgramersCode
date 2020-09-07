package code.programers.level.two;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class NewsClustrering {

    String[] multiCombination(String str)
    {
        List<String> result = new ArrayList<String>();

        for(int index=0; index< str.length()-1; index++)
        {
            String factor = str.substring(index, index+2).toUpperCase();

            if(isEnglish(factor))
            {
                result.add(factor);
            }
        }

        return result.toArray(new String[0]);
    }

    boolean isEnglish(String str)
    {
        return str.matches("^[a-zA-Z]*$");
    }

    Map<String, Integer> countKey(String[] list)
    {
        Map<String, Integer> result = new HashMap<String, Integer>();
        for(String str:list)
            result.put(str, result.getOrDefault(str, 0) + 1);

        return result;
    }
}