package code.programers.level.one;

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
}