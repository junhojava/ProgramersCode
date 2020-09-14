package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IndexNumberTest {
    
    IndexNumber in = new IndexNumber();

    @Test
    void testLength()
    {
        assertEquals(4, in.length(2,5));
    }
}