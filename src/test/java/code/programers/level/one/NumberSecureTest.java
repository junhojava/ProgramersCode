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
}