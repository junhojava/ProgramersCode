package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AverageTest {
    Average average = new Average();

    @Test
    void testSum()
    {
        assertEquals(20, average.sum(4,6, 10));
    }

    @Test
    void average()
    {
        assertEquals(2.5, average.average(10, 4));
    }
}