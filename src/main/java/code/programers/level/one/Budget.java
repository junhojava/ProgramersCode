package code.programers.level.one;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Budget {
    
    void sort(int[] list)
    {
        Arrays.sort(list);
    }

    Map<String, Integer> combination(int[] list)
    {
        Map<String, Integer> result = new HashMap<String ,Integer>();

        result.put("1", 1);
        result.put("2", 1);
        result.put("3", 1);
        result.put("4", 1);
        result.put("5", 1);
        result.put("12", 1);
        result.put("13", 1);
        result.put("14", 1);
        result.put("15", 1);
        result.put("23", 1);
        result.put("24", 1);
        result.put("25", 1);
        result.put("34", 1);
        result.put("35", 1);
        result.put("45", 1);
        result.put("123", 1);
        result.put("124", 1);
        result.put("125", 1);
        result.put("134", 1);
        result.put("135", 1);
        result.put("145", 1);
        result.put("234", 1);
        result.put("235", 1);
        result.put("245", 1);
        result.put("345", 1);
        result.put("1234", 1);
        result.put("1235", 1);
        result.put("2345", 1);
        result.put("12345", 1);

        return result;
    }
}