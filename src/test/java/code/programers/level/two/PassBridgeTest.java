package code.programers.level.two;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Arrays;

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
    void testCount()
    {
        pb.time = 10;
        int[] trucks = new int[]{7,4,5,6};
        pb.putTruckInfo(trucks);
        pb.weight = 10;
        int count = 0;
        int[] times = new int[pb.trucks.size()];
        int index=0;

        while(index>times.length)
        {

        }
    }
}