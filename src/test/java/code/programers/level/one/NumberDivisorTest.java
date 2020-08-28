package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class NumberDivisorTest
{
    @Test
    void testDivisionFiveList()
    {
        NumberDivisor five = new NumberDivisor(5);
        int[] numbers = {5, 9, 7, 10};

        assertArrayEquals(new int[]{5, 0, 0, 10}, five.divisorList(numbers));
    }

    void testZeroCount()
    {
        NumberDivisor five = new NumberDivisor(5);
        int[] numbers = {5, 0, 0, 10};

        assertEquals(2, five.countNumber(numbers, 0));
    }
}