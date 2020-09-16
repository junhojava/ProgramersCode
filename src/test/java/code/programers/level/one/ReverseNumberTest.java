package code.programers.level.one;

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
}