package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class MinMaxTest
{
    MinMax mm = new MinMax();

    @Test
    void testSplit()
    {
        String str = "-1 -2 -3 -4";

        String[] result = {"-1", "-2", "-3", "-4"};

        assertArrayEquals(result, mm.split(str));
    }
}