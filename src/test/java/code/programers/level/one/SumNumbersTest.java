package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumNumbersTest {
    
    SumNumbers sn = new SumNumbers();
    @Test
    void testConvertNumber()
    {
        int n = 123;

        assertEquals("123", sn.convertIntToString(n));
    }

    @Test
    void testSplit()
    {
        int n = 123;

        String[] list= sn.split(sn.convertIntToString(n));

        assertArrayEquals(new String[]{"1", "2", "3"}, list);
    }
}