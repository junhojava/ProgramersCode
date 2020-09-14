package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SortStringTest {
    
    SortString ss = new SortString();

    @Test
    void testSubString()
    {
        String[] list = {"sun", "bed", "car"};
        String[] subList = ss.substring(list, 1);

        assertArrayEquals(new String[]{"ar", "ed", "un"}, ss.sort(subList));
    }

    @Test
    void testCompare()
    {
        assertTrue(ss.compare("sun", "un", 1));
    }
}