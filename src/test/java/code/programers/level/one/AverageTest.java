package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AverageTest {
    Average average = new Average();

    @Test
    void testSum()
    {
        assertEquals(10, average.sum(4,6));
    }

    @Test
    void length()
    {
        assertEquals(2, average.length(new int[]{0, 1}));
    }

    @Test
    void average()
    {
        assertEquals(2.5, average.average(10, 4));
    }
}