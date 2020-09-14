package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class IndexNumberTest {
    
    IndexNumber in = new IndexNumber();

    @Test
    void testSplitedList()
    {
        int[] result = in.split(new int[]{1, 5, 2, 6, 3, 7, 4}, 2, 5);
        result = in.sort(result);
        assertArrayEquals(new int[]{2,3,5,6}, result);
    }

    @Test
    void testCaseOne()
    {
        int[] result = in.split(new int[]{1,5,2,6,3,7,4}, 2, 5);
        result = in.sort(result);

        assertEquals(5, result[2]);
    }

    @Test
    void testCaseTwo()
    {
        int[] result = in.split(new int[]{1,5,2,6,3,7,4}, 4, 4);
        result = in.sort(result);

        assertEquals(6, result[0]);
    }
}