package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DescendNumberTest {
    
    ReverseNumber rn = new ReverseNumber();
    SumNumbers sn = new SumNumbers();

    @Test
    void testToString()
    {
        long n = 118372;

        assertEquals("118372", rn.toString(n));
    }

    @Test
    void testSplit()
    {
        assertArrayEquals(new String[]{"1", "1", "8", "3", "7", "2"}, sn.split(rn.toString(118372)));
    }
}