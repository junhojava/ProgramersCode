package code.programers.level.two;

import java.util.ArrayList;
import java.util.List;

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
}