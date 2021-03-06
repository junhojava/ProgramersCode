package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CaesarCipherTest {
    
    CaesarCipher cc = new CaesarCipher();

    @Test
    void testIsAlphabet()
    {
        assertTrue(cc.isAlphabet(" "));
    }

    @Test
    void testAIsLowCase()
    {
        assertTrue(cc.isLowCase("A"));
    }

    @Test
    void testShiftString()
    {
        assertEquals("b", cc.lowShift("a", 1));
    }

    @Test
    void testCaseOne()
    {
        String s = "a B z";
        String answer = "";

        for(int index=0; index<s.length(); index++)
        {
            String c = s.substring(index, index+1);
            if(cc.isAlphabet(c))
                if(cc.isLowCase(c))
                    answer += cc.lowShift(c, 4);
                else
                    answer += cc.upperShift(c, 4);
            else
                answer += " ";
        }

        assertEquals("e F d", answer);
    }

    @Test
    void testCaseTwo()
    {
        String s = "z";
        String answer = "";

        for(int index=0; index<s.length(); index++)
        {
            String c = s.substring(index, index+1);
            if(cc.isAlphabet(c))
                if(cc.isLowCase(c))
                    answer += cc.lowShift(c, 1);
                else
                    answer += cc.upperShift(c, 1);
            else
                answer += " ";
        }

        assertEquals("a", answer);
    }
}