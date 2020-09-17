package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CollatzTest {
    
    Collatz collatz = new Collatz();

    @Test
    void testIsOne()
    {
        assertTrue(collatz.isOne(1));
    }

    @Test
    void testIsEven()
    {
        assertTrue(collatz.isEven(2));
    }

    @Test
    void testEvenCalc()
    {
        assertEquals(2, collatz.evenCalc(4));
    }
}