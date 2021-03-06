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

    @Test
    void testCompare()
    {
        String[] result = {"-1", "-2", "-3", "-4"};

        assertArrayEquals(new int[]{-4, -3, -2, -1}, mm.parseInt(result));
    }
}