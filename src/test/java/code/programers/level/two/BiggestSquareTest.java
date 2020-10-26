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

    @Test
    void testCaseOne()
    {
        int[][] array = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,0,1}};
        int max = 0;

        for(int x=1; x<4; x++)
            for(int y=1; y<4; y++)
            {
                array[x][y] = bs.min(array[x-1][y], array[x-1][y-1], array[x][y-1])+1;
                max = (max< array[x][y]) ? array[x][y] : max;
            }

        assertEquals(3, max);

    }
}