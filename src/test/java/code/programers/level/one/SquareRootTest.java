package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SquareRootTest {
    
    SquareRoot sr = new SquareRoot();

    @Test
    void testDivideTwo()
    {
        assertEquals(24.5, sr.divideTwo(49));
    }

    @Test
    void testMinusLoop()
    {
        assertEquals(6, sr.minusLoop(25));
    }
}