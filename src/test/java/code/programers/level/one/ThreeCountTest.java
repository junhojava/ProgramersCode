package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ThreeCountTest {
    
    ThreeCount tc = new ThreeCount();
    @Test
    void test()
    {
        String[] list = new String[60];
        for(int second = 0; second < 60 ; second++)
        {
            list[second] = tc.append(second);
        }

        assertEquals(list[3], "02");
    }

    @Test
    void testMinute()
    {
        int count= 0;
        String hour_str = "";
        String minute_str = "";
        String second_str = "";
        String result = "";
        for(int hour= 0; hour< 6; hour++)
        {
            hour_str = tc.append(hour);
            for(int minute = 0; minute < 60; minute++)
            {
                minute_str = tc.append(minute);
                for(int second= 0; second < 60; second++)
                {
                    second_str = tc.append(second);

                    result = hour_str +  minute_str + second_str;
                    if(result.contains("3"))
                    {
                        count++;
                    }
                    else
                    {

                    }
                }
        }
        }

        assertEquals(11475, count);
    }
}