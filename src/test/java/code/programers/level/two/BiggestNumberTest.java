package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class BiggestNumberTest {

    BiggestNumber bn = new BiggestNumber();


    @Test
    void testPermutation()
    {
        bn.list = new ArrayList<int[]>();
        int[] numbers = {6, 10, 2};
        int[] arr = { 0, 1, 2 };
        bn.permutation(arr, 0);
        int max = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int[] array: bn.list)
        {

            for(int index: array)
                sb.append(numbers[index]);

            if(max < Integer.parseInt(sb.toString()))
                max = Integer.parseInt(sb.toString());

            sb.setLength(0);
        }

        assertEquals(6210, max);
    }

    @Test
    void testCompare()
    {
        int compare = bn.stringCompare("10", "2");

        boolean result = (compare > 0) ? true: false;

        assertTrue(result);
    }

    @Test
    void testSort()
    {
        int[] numbers = {6, 10, 2};
        bn.init(numbers);
        bn.sort();

        assertArrayEquals(new Integer[]{6, 2, 10}, bn.array);
    }
}