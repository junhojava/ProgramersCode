package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TargetNumberTest
{
    TargetNumber tn = new TargetNumber(5);;

    @Test
    void testInit()
    {
        assertEquals(32, tn.results.length);
    }

    @Test
    void testFill()
    {
        int[] array = {1,1,1};
        int count = 0;

        for(int number: array)
        {
            if(count == 0)
                tn.fill(number, ++count);
            else
                tn.fill(number, count*=2);
        }

        int[] results = new int[]{3,1,1,-1,1,-1,-1,-3,3,1,1,-1,1,-1,-1,-3,3,1,1,-1,1,-1,-1,-3,3,1,1,-1,1,-1,-1,-3};

        assertArrayEquals(tn.results, results);
    }
}