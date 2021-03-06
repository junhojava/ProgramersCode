package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AccumulatorTest {
    
    @Test
    void testBetweenTwoNumbers()
    {
        Accumulator accumulator = new Accumulator();

        assertEquals(-54, accumulator.sumBetweenTwoNumbers(-10, -2));
        assertEquals(10, accumulator.sumBetweenTwoNumbers(10, 10));
    }
}