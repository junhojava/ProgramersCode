package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class CompressStringTest {

    /**
     * aabbaccc(8) = (aa)(bb)(a)(ccc) = 2a2ba3c(7)
     * ababcdcdababcdcd(16) = (ababcdcd)(ababcdcd) = 2ababcdcd(9)
     * abcabcdede(10) = (abcabc)dede = 2abcdede(8)
     * abcabcabcabcdededededede(24) = (abcabc)(abcabc)(dedede)(dedede) = 2abcabc2dedede (14)
     * xababcdcdababcdcd(17) = xababcdcdababcdcd(17)
     */
    CompressString compressString = new CompressString();

    @Test
    void testFirstCharacterDuiplication()
    {
        String s= "xasdfasdf";

        assertFalse(compressString.firstCharacterDuplication(s));
    }

    @Test
    void testIsEven()
    {
        String s= "aabbaccc";
        String s2 = "xababcdcdababcdcd";

        assertTrue(compressString.isEven(s.length()));
        assertFalse(compressString.isEven(s2.length()));
    }

    @Test
    void testCalc()
    {
        String s = "aabbaccc";
        List<String> string_list = new ArrayList<String>();

        List<String> result = compressString.splitAt(s, 1, s.length());

        string_list.add("a");
        string_list.add("a");
        string_list.add("b");
        string_list.add("b");
        string_list.add("a");
        string_list.add("c");
        string_list.add("c");
        string_list.add("c");

        assertEquals(result, string_list);
    }

    @Test
    void testIsRemeined()
    {
        String s ="aabbaccc";

        assertTrue(compressString.isRemained(s.length(), 3));
    }

    @Test
    void testSplitThree()
    {
        String s ="aabbaccc";

        List<String> string_list = compressString.splitAt(s, 3, s.length());
        List<String> result = new ArrayList<String>();

        if(compressString.isRemained(s.length(), 3))
        {
            int value = s.length()%3;
            string_list.add(s.substring(s.length()-value, s.length()));
        }

        result.add("aab");
        result.add("bac");
        result.add("cc");

        assertEquals(result, string_list);
    }

    @Test
    void testaccumulateString()
    {
        String left ="aa";
        String right = "aa";

        assertTrue(compressString.isSameString(left, right));
    }
    
    @Test
    void testTestCaseOne()
    {
        String s ="aabbaccc";

        List<String> string_list = compressString.splitAt(s, 1, s.length());

        int count = 1;

        Map<String, Integer> map = new HashMap<String, Integer>();

        s="";

        for(int index=0; index< string_list.size()-1; index++)
        {
            if(compressString.isSameString(string_list.get(index), string_list.get(index+1)))
            {
                count++;
                map.put(string_list.get(index), count);
            }
            else
            {
                s += count+string_list.get(index);
                map.remove(string_list.get(index));
                count = 1;
            }
        }

        if(!map.isEmpty())
        {
            for(Map.Entry<String, Integer> entry: map.entrySet())
            {
                s += entry.getValue() + entry.getKey();
            }

            s = s.replaceAll("[1]", "");
        }

        assertEquals("2a2ba3c", s);
    }

    @Test
    void testCaseTwo()
    {
        String s = "aabbaccc";

        System.out.println(1/2);
        assertEquals(7, compressString.minLength(s));
    }
}