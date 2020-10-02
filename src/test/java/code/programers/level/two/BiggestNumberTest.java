package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}