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

    @Test
    void testFill()
    {
        int brown = 8;
        int yellow = 1;

        int x = brown + yellow;
        int y;

        for(y =3; y<=Math.sqrt(x); y++)
        {
            int z = carpet.divide(x, y);

            if(carpet.modIsZero(x, y))
                if(carpet.fill(y, z-2) == brown)
                    break;
        }

        assertEquals(y, 6);
    }
}