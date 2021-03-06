package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
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

    @Test
    void removeMin()
    {
        int[] list = new int[]{4,1,3,2,1,1};
        int min = rmn.min(list);

        assertArrayEquals(new int[]{4,3,2}, rmn.removeMin(list, min));
    }
}