package code.programers.level.one;

import java.util.ArrayList;
import java.util.List;

public class Dart {
    int[] numbers(String input)
    {
        int result[] = new int[3];
        int count = 0;
        for(String number:input.split("\\D"))
        {
            if(!number.equals(""))
            {
                result[count++] = Integer.parseInt(number);
            }
        }

        return result;
    }

    String[] area(String input)
    {
        String result[] = new String[3];
        int count = 0;

        for(String alphabet:input.split("[^SDT]"))
        {
            if(!alphabet.equals(""))
            {
                result[count++] = alphabet;
            }
        }
        return result;
    }

    String[] special(String input)
    {
        String result[] = new String[3];
        int count = 0;

        for(String alphabet:input.split("\\d"))
        {
            if(!alphabet.equals(""))
            {
                result[count++] = alphabet;
            }
        }
        return result;
    }
}