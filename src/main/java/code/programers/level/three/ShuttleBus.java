package code.programers.level.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShuttleBus {

    boolean isRemained(String[] seats)
    {
        for(String seat:seats)
            if(seat.equals(""))
                return true;

        return false;
    }

    String[] times(int n, int t)
    {
        String[] result = new String[n];

        for(int index=0; index < n; index++)
        {
            int minute = index * t;
            int hour = 0;

            if(minute > 59)
            {
                hour = minute / 60;
                minute = hour % 60;
            }

            result[index] = prefix(hour+ 9) + ":" + prefix(minute);

        }

        return result;
    }

    String prefix(int number)
    {
        if(number < 10)
            return "0" + Integer.toString(number);
        else
            return Integer.toString(number);
    }

    String[][] seat(int n, int t, int m, String[] timetable)
    {
        String[][] result = new String[n][m];
        String[] timelist = times(n, t);
        Arrays.sort(timetable);

        for(int index=0; index< n; index++)
        {
            List<String> list = new ArrayList<String>();
            int hour = Integer.parseInt(timelist[index].split(":")[0]);
            int minute = Integer.parseInt(timelist[index].split(":")[1]);

            for(int table_index=0; table_index < timetable.length; table_index++)
            {
                if(!timetable[table_index].equals(""))
                {
                    int time_hour = Integer.parseInt(timetable[table_index].split(":")[0]);
                    int time_minute = Integer.parseInt(timetable[table_index].split(":")[1]);

                    if(hour > time_hour || (hour == time_hour && minute >= time_minute))
                    {
                        if(list.size() < m)
                        {
                            list.add(timetable[table_index]);
                            timetable[table_index] = "";
                        }
                    }
                }
            }

            while(list.size() != m)
            {
                list.add("");
            }
            result[index] = list.toArray(new String[0]);
        }

        return result;
    }
}