package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveMinNumberTest {
    
    RemoveMinNumber rmn = new RemoveMinNumber();

    @Test
    void testMax()
    {
        assertEquals(4, rmn.max(new int[]{4,3,2,1}));
    }
}