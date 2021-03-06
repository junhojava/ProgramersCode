package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AverageTest {
    Average average = new Average();

    @Test
    void testCalc()
    {
        double sumOfValue = average.sum(4,6);
        double twoHalf = average.divide(10, 4);

        assertEquals(10, sumOfValue);
        assertEquals(2.5, twoHalf);
    }
}