package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrimeNumberTest {

    PrimeNumber pn = new PrimeNumber();

    @Test
    void tsetDivideOne()
    {
        assertEquals(1, pn.divide(2,2));
    }

    @Test
    void testModZero()
    {
        assertEquals(0, pn.mod(2,2));
    }
}