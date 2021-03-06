package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DescendSortStringTest {
    
    DescendSortString dss = new DescendSortString();

    @Test
    void test()
    {
        String s= "Zbcdefg";

        String[] result = dss.split(s);

        assertArrayEquals(new String[]{"bcdefg", "Z"}, result);
    }

    @Test
    void sort()
    {
        String s = "bcdefg";

        String result = dss.sort(s);

        assertEquals("gfedcb", result);
    }
}