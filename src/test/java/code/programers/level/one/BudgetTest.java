package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class BudgetTest {

    Budget budget = new Budget();


    @Test
    void testAscend()
    {
        int[] list = {1,3,2,5,4};

        budget.sort(list);

        assertArrayEquals(new int[]{1,2,3,4,5}, list);
    }

    @Test
    void testCombination()
    {
        int[] list = {1,3,2,5,4};
        budget.sort(list);
        Map<String, Integer> map = budget.combination(list);

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

        assertEquals(result, map);
    }
}