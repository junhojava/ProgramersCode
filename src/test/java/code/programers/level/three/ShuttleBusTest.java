package code.programers.level.three;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class ShuttleBusTest {

    ShuttleBus sb = new ShuttleBus();

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

        assertArrayEquals(new String[]{"08:00", "08:01", "08:02", "08:03", ""}, list[0]);
    }

    @Test
    void testSeatBus2()
    {
        int n = 2;
        int t = 10;
        int m = 2;

        String[][] list = sb.seat(n, t, m, new String[]{"09:10", "09:09", "08:00"});

        assertArrayEquals(new String[][]{{"08:00", ""}, {"09:09", "09:10"}}, list);
    }

    @Test
    void testRemained()
    {
        int n = 2;
        int t = 10;
        int m = 2;

        String[][] list = sb.seat(n, t, m, new String[]{"09:10", "09:09", "08:00"});

        assertFalse(sb.isRemained(list[n-1]));
    }

    @Test
    void testCaseOne()
    {
        int n = 1;
        int t = 1;
        int m = 5;
        String result = "";

        String[][] list = sb.seat(n, t, m, new String[]{"08:00", "08:01", "08:02", "08:03"});

        if(sb.isRemained(list[n-1]))
        {
            result = sb.times(n, t)[0];
        }
        else
        {
            int hour = Integer.parseInt(list[n-1][m-1].split(":")[0]);
            int minute = Integer.parseInt(list[n-1][m-1].split(":")[1]);

            if(minute - 1 < 0)
            {
                hour = hour -1;
                minute = 59;
            }

            result = sb.prefix(hour) + ":" + sb.prefix(minute);
        }

        assertEquals("09:00", result);
    }
}