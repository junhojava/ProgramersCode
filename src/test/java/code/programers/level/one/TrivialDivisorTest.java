package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TrivialDivisorTest {
    
    TrivialDivisor td = new TrivialDivisor();

    @Test
    void testMod()
    {
        assertEquals(0,td.mod(12, 6));
    }

    @Test
    void testCaseOne()
    {
        int n = 12;
        int answer = 0;
        for(int index= 1; index<=n; index++)
        {
            if(td.mod(n, index) == 0)
                answer += index;
        }

        assertEquals(28, answer);
    }
}