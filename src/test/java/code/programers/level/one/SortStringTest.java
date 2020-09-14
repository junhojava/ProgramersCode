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

        for(int lindex=0; lindex<strList.size(); lindex++)
            if(ss.compare(strList.get(lindex), "an", 1))
            {
                arr.add(strList.get(lindex));
            }

        Collections.sort(arr);

        assertArrayEquals(new String[]{"can", "man"}, arr.toArray(new String[0]));
    }

    @Test
    void testCaseOne()
    {
        String[] strings = {"bar", "sun", "bed", "car"};
        String[] subStrings = ss.substring(strings, 1);
        subStrings= ss.sort(subStrings);

        List<String> strList = Arrays.asList(strings);
        List<String> arr = new ArrayList<String>();
        List<String> result = new ArrayList<String>();

        for(int index=0; index< subStrings.length; index++)
        {
            boolean flag = ss.isMulti(subStrings, subStrings[index]);
            for(String str:strList)
            {
                if(ss.compare(str, subStrings[index], 1))
                {
                    arr.add(str);

                    if(flag)
                        index++;
                }
            }

            Collections.sort(arr);

            for(String str:arr)
            {
                result.add(str);
            }

            if(flag)
                index--;

            arr.clear();
        }

        assertArrayEquals(new String[]{"bar", "car", "bed", "sun"}, result.toArray(new String[0]));
    }
}