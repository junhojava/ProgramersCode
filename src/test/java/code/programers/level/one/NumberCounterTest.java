package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberCounterTest {

    @Test void testOneEquals()
    {
        NumberCounter one = new NumberCounter(1);

        assertEquals(new NumberCounter(1), one);
    }
}