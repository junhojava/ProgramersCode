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

        int[] pair = accumulator.diffMinMax(5, 3);

        assertArrayEquals(new int[]{3, 5}, pair);
    }

    @Test
    void testEqualsNumber()
    {
        Accumulator accumulator = new Accumulator();

        assertFalse(accumulator.numberEquals(5, 3));
        assertTrue(accumulator.numberEquals(3, 3));
    }

    @Test
    void testSumZeroToMax()
    {
        Accumulator accumulator = new Accumulator();

        assertEquals(15, accumulator.sumZeroToMax(5));
    }
}