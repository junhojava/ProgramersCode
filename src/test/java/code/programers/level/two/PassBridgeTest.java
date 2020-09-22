package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class PassBridgeTest {

    PassBridge pb = new PassBridge();

    @Test
    void testDescendSort()
    {
        pb.trucks = new int[]{7,4,5,6};
        pb.ascendSort();

        assertArrayEquals(new int[]{4,5,6,7}, pb.trucks);
    }
}