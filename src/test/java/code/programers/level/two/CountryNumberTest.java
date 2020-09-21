package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CountryNumberTest {
    CountryNumber cn = new CountryNumber();

    @Test
    void testDivide()
    {
        assertEquals(1,cn.divide(3, 3));
    }

    @Test
    void testMod()
    {
        assertEquals(0, cn.mod(3,3));
    }

    @Test
    void testFour()
    {
        int number = 4;

        int mod = cn.mod(number, 3);
        number = cn.divide(number, 3);

        assertEquals(1 , mod);
        assertEquals(1 , number);

        number = 7;

        mod = cn.mod(number, 3);
        number = cn.divide(number, 3);

        assertEquals(1 , mod);
        assertEquals(2 , number);
    }

    @Test
    void isZero()
    {
        assertTrue(cn.isZero(0));
    }

    @Test
    void testCaseOne()
    {
        int number = 1;
        String result = "";
        int count = 0;

        result = cn.convert(number, count);

        assertEquals("412", result);
    }
}