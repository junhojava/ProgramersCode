package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class AccumulatorTest {
    
    @Test
    void testBetweenTwoNumbers()
    {
        Accumulator accumulator = new Accumulator();

        long[] twoNTen = new long[]{-2, -10};
        long[] tens = new long[]{10, 10};

        Arrays.sort(twoNTen);
        Arrays.sort(tens);

        assertEquals(-54, accumulator.sumBetweenTwoNumbers(twoNTen[0], twoNTen[1]));
        assertEquals(10, accumulator.sumBetweenTwoNumbers(tens[0], tens[1]));
    }
}