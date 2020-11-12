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
        tn.fill(1);

        int[] results = new int[32];

        for(int i=0; i< 32; i++)
            if(i%2 == 0)
                results[i] = 1;
            else
                results[i] = -1;

        assertArrayEquals(tn.results, results);
    }
}