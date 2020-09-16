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

    @Test
    void testCaseOne()
    {
        int n = 123;

        String[] list= sn.split(sn.convertIntToString(n));

        int result = 0;

        for(String number: list)
        {
            result += Integer.parseInt(number);
        }

        assertEquals(6, result);
    }
}