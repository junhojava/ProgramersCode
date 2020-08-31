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
}