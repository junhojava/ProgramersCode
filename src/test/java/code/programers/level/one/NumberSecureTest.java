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
}