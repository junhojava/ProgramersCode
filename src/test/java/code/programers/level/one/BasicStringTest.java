package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BasicStringTest {
    
    BasicString bs = new BasicString();

    @Test
    void testLength()
    {
        String str = "a234";

        assertEquals(4, bs.length(str));
    }

    @Test
    void testReplaceNumber()
    {
        String str = "a234";

        assertEquals("a", bs.replaceNumber(str));
    }
}