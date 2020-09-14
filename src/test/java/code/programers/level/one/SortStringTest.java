package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    @Test
    void testIsMulti()
    {
        assertTrue(ss.isMulti(new String[]{"cd", "cd"}, "cd"));
    }

    @Test
    void testConcat()
    {
        String[] list = {"man", "can"};

        List<String> strList = Arrays.asList(list);
        List<String> arr = new ArrayList<String>();

        for(String str:strList)
        {
            if(ss.compare(str, "an", 1))
                arr.add(str);
        }

        Collections.sort(arr);

        assertArrayEquals(new String[]{"can", "man"}, arr.toArray(new String[0]));
    }
}