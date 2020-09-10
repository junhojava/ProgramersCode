package code.programers.level.three;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShuttleBusTest {

    ShuttleBus sb = new ShuttleBus();

    @Test
    void testRemained()
    {
        int n = 1;
        int m = 5;

        String[] timetable = {"08:00", "08:01", "08:02", "08:03"};

        int count = sb.remained(n, m, timetable.length);

        assertEquals(1, count);
    }

    @Test
    void testTimeList()
    {
        int n = 1;
        int t = 1;

        String[] list = sb.times(n, t);

        assertArrayEquals(new String[]{"09:00"}, list);
    }

    @Test
    void testSeatBus()
    {
        int n = 1;
        int t = 1;
        int m = 5;

        String[][] list = sb.seat(n, t, m, new String[]{"08:00", "08:01", "08:02", "08:03"});

        assertArrayEquals(new String[]{"08:00", "08:01", "08:02", "08:03"}, list[0]);
    }
}