package code.programers.level.one;

import java.util.ArrayList;
import java.util.List;

public class Dart {

    String area= "SDT";

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

    String[] character(String input)
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

    int calc(int number, String character)
    {
        int length = area.indexOf(character);

        for(int index=0, value = number; index<length; index++)
        {
            number *= value;
        }

        return number;
    }
}