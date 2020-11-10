package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CarpetTest
{
    Carpet carpet = new Carpet();

    @Test
    void testDivide()
    {
        assertEquals(4, carpet.divide(12,3));
    }

    @Test
    void testIsModZero()
    {
        assertTrue(carpet.modIsZero(12,5));
    }

    @Test
    void testIsSmall()
    {
        assertTrue(3<=4);
    }
}