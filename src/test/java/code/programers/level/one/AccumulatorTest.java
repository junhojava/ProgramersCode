package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AccumulatorTest {
    
    @Test
    void testBiggerNumber()
    {
        Accumulator accumulator = new Accumulator();
        long[] pair = new long[]{5, 3};

        accumulator.sortLongArray(pair);

        assertArrayEquals(new long[]{3, 5}, pair);
    }

    @Test
    void testBetweenTwoNumbers()
    {
        Accumulator accumulator = new Accumulator();

        long[] caseOne = new long[]{-2, -10};
        long[] caseTwo = new long[]{10, 10};

        accumulator.sortLongArray(caseOne);
        accumulator.sortLongArray(caseTwo);

        assertEquals(-54, accumulator.sumBetweenMinToMax(caseOne[0], caseOne[1]));
        assertEquals(10, accumulator.sumBetweenMinToMax(caseTwo[0], caseTwo[1]));
    }
}