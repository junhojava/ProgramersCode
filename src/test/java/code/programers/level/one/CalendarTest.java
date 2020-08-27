package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalendarTest {

    /**
     * 2016-01-01 = FRI
     * [SUN, MON, TUE, WED, THU, FRI, SAT]
     *   0    1    2    3    4    5    6
     * 2016-05-24 = TUE
     */

    @Test
    void testNewYear()
    {
        Calendar calendar = new Calendar();

        int day= calendar.date(1, 1);

        assertEquals(5, day);
    }
}