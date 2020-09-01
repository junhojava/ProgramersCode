package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
    void testOnly()
    {
        String s= "xababcdcdababcdcd";

        assertTrue(compressString.only(s, s.substring(0, 1)));
    }

    @Test
    void testRemain()
    {
        String s = "asdf";

        assertTrue(compressString.remained(s.length(), 3));
    }

    @Test
    void testEqualsString()
    {
        String s = "aa";

        assertFalse(compressString.equalsString(s, "ab"));
        assertTrue(compressString.equalsString(s, "aa"));
    }

    @Test
    void testSpliedList()
    {
        String s = "aaabbccc";

        assertArrayEquals(new String[]{"aaa", "bbc"}, compressString.splitedList(s, 3));
    }
}