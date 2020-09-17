package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NumberSecureTest {
    
    NumberSecure ns = new NumberSecure();

    @Test
    void testAppendSecureCode()
    {
        String result = "";

        result = ns.appendSecureCode("*", 7);

        assertEquals("*******", result);
    }

    @Test
    void testConcatNumber()
    {
        String result = "";
        result = ns.appendSecureCode("*", 7);

        result = ns.concatNumber(result, "4");
        result = ns.concatNumber(result, "4");
        result = ns.concatNumber(result, "4");
        result = ns.concatNumber(result, "4");

        assertEquals("*******4444", result);
    }

    @Test
    void testCaseOne()
    {
        String str = "027778888";
        int length = str.length()-4;
        String result = "";

        result = ns.appendSecureCode("*", length);

        for(int index= length; index< str.length(); index++)
        {
            result = ns.concatNumber(result, str.substring(index, index+1));
        }

        assertEquals("*****8888", result);
    }
}