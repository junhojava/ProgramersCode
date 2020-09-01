package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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

        List<String> result = compressString.splitAt(s, 3, s.length());

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
}