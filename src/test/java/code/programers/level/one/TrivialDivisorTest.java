package code.programers.level.one;

import org.junit.jupiter.api.Test;

public class TrivialDivisorTest {
    
    TrivialDivisor td = new TrivialDivisor();

    @Test
    void testMod()
    {
        assertEquals(0,td.mod(12, 6));
    }
}