package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FibonaciTest
{
    Fibonaci fbnc = new Fibonaci();

    @Test
    void testZeroAndOne()
    {
        assertEquals(0, fbnc.calc(0));
        assertEquals(1, fbnc.calc(1));
    }

    @Test
    void testCalc()
    {
        int n = 5;

        assertEquals(n, fbnc.calc(n));
    }

}