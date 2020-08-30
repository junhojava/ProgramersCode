package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class AccumulatorTest {
    
    @Test
    void testBiggerNumber()
    {
        Accumulator accumulator = new Accumulator();

        long[] pair = accumulator.diffMinMax(5, 3);

        assertArrayEquals(new long[]{3, 5}, pair);
    }

    @Test
    void testEqualsNumber()
    {
        Accumulator accumulator = new Accumulator();

        assertFalse(accumulator.numberEquals(5, 3));
        assertTrue(accumulator.numberEquals(3, 3));
    }

    @Test
    void testCaseOne()
    {
        Accumulator accumulator = new Accumulator();

        long[] pair = accumulator.diffMinMax(-2, -10);

        assertEquals(-54, accumulator.sumBetweenMinToMax(pair[0], pair[1]));
    }
}