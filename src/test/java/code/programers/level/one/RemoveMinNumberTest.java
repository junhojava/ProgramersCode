package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RemoveMinNumberTest {
    
    RemoveMinNumber rmn = new RemoveMinNumber();

    @Test
    void testMin()
    {
        int[] list = new int[]{4,3,2,1};

        int min = rmn.min(list);

        assertEquals(1, min);
    }
}