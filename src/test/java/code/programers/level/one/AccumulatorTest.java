package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class AccumulatorTest {
    
    @Test
    void testBiggerNumber()
    {
        Accumulator accumulator = new Accumulator();

        int[] pair = accumulator.diffMinMax(3, 5);

        assertArrayEquals(new int{3, 5}, pair);
    }
}