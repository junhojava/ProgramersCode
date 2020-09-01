package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class CompressStringTest {

    /**
     * aabbaccc(8) = (aa)(bb)(a)(ccc) = 2a2ba3c(7)
     * ababcdcdababcdcd(16) = (ababcdcd)(ababcdcd) = 2ababcdcd(9)
     * abcabcdede(10) = (abcabc)dede = 2abcdede(8)
     * abcabcabcabcdededededede(24) = (abcabc)(abcabc)(dedede)(dedede) = 2abcabc2dedede (14)
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

        compressString.isEven(s.length());
    }
}