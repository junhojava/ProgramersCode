package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class SecretMapTest {
    SecretMap sm = new SecretMap();

    @Test
    void testIsEven()
    {
        assertFalse(sm.isEven(13));
    }

    @Test
    void testTwoSqrt()
    {
        int number = sm.sqrt(2, 5);

        assertEquals(32, number);
    }

    @Test
    void testFillMap()
    {
        String one = " #   ";
        String two = "# # #";

        String result = sm.fill("     ",one, two);

        assertEquals("### #", result);
    }
}