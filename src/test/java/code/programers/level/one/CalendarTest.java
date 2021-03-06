package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalendarTest {

    Calendar calendar = new Calendar(5);

    @Test
    void whatDateNumbers()
    {
        int january = calendar.addedDate(1);
        int february = calendar.addedDate(2);
        int may = calendar.addedDate(5);

        assertEquals(0, january);
        assertEquals(31, february);
        assertEquals(121, may);
    }
    
    @Test
    void testWhatDayIsItToday()
    {
        int new_year = calendar.dayIndex(1, 1);
        int second= calendar.dayIndex(5, 24);
        
        assertEquals(5, new_year);
        assertEquals(2, second);
        

        assertEquals("FRI", calendar.whatDay(new_year));
        assertEquals("TUE", calendar.whatDay(second));
    }
}