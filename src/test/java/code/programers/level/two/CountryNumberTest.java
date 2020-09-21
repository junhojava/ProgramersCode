package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}