package code.programers.level.three;

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
}