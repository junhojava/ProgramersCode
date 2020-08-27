package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalendarTest {


    @Test
    void testNewYear()
    {
        Calendar calendar = new Calendar();

        String day_string= calendar.date(2016, 1, 1);

        assertEquals("FRI", day_string);
    }
}