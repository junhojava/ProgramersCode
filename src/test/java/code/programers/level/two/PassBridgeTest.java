package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

public class PassBridgeTest {

    PassBridge pb = new PassBridge();

    @Test
    void testDescendSort()
    {
        int[] trucks = new int[]{7,4,5,6};
        Arrays.sort(trucks);

        assertArrayEquals(new int[]{4,5,6,7}, trucks);
    }

    @Test
    void testCaseOne()
    {
        int[] trucks = new int[]{7,4,5,6};

        assertEquals(8, pb.solution(2, 10, trucks));
    }

    @Test
    void testCaseTwo()
    {
        int[] trucks = new int[]{10};

        assertEquals(101, pb.solution(100, 100, trucks));
    }

    @Test
    void testCaseThree()
    {
        int[] trucks = new int[]{10,10,10,10,10,10,10,10,10,10};

        assertEquals(110, pb.solution(100, 100, trucks));
    }
}