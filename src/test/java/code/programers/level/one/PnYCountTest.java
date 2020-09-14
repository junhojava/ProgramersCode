package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class PnYCountTest {
    
    PnYCount pyc = new PnYCount();

    @Test
    void testCount()
    {
        String s = "pPoooyY";

        int[] count = pyc.count(s);

        assertArrayEquals(new int[]{2,2}, count);
    }
}