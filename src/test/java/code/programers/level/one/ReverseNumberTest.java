package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ReverseNumberTest {
    
    SumNumbers sn = new SumNumbers();
    ReverseNumber rn = new ReverseNumber();

    @Test
    void testToString()
    {
        long n = 12345;

        String str = rn.toString(n);

        assertEquals("12345", str);
    }

    @Test
    void testCaseOne()
    {
        long n = 12345;
        String[] list = sn.split(rn.toString(n));
        String[] result = rn.reverse(list);

        assertArrayEquals(new String[]{"5", "4", "3", "2", "1"}, result);
    }
}