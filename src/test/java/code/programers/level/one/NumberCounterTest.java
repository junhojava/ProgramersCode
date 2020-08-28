package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NumberCounterTest {

    @Test void testOneEquals()
    {
        NumberCounter one = new NumberCounter(1);

        assertTrue(one.equals(new NumberCounter(1)));
    }
}