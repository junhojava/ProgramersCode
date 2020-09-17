package code.programers.level.one;

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
    void isEven()
    {
        assertTrue(collatz.isEven(2));
    }
}