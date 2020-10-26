package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class BiggestSquareTest
{
    BiggestSquare bs = new BiggestSquare();

    @Test
    void testIsOne()
    {
        assertTrue(bs.isOne(1));
        assertFalse(bs.isOne(0));
    }

    @Test
    void testMin()
    {
        assertEquals(1, bs.min(1,5,3));
    }
}