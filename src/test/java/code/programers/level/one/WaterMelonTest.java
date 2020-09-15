package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class WaterMelonTest {
    
    WaterMelon wm = new WaterMelon();

    @Test
    void testModTwo()
    {
        assertEquals(0, wm.mod(4, 2));
    }

    @Test
    void testCaseOne()
    {
        String answer = "";
        for(int index = 1; index <= 3; index++)
        {
            answer += Integer.toString(wm.mod(index, 2));
        }

        assertEquals("101", answer);
    }
}