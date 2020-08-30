package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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

        assertTrue(accumulator.numberEquals(5, 3));
    }
}