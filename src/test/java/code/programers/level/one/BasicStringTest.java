package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BasicStringTest {
    
    BasicString bs = new BasicString();

    @Test
    void testReplaceNumber()
    {
        String str = "a234";
        
        assertEquals("a", bs.removeNumber(str));
    }
}