package code.programers.level.one;

public class Calendar {

    int new_year = 5;

    int[] lastdays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    String[] daystr = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

    String dayConvertString(int day)
    {
        return daystr[day];
    }

    int date(int month, int day)
    {
        if(month == 1 && day == 1)
        {
            return new_year;
        }
        else
        {
            day += convertMonthToDay(month);
            day += new_year - 1;
            day %= 7;
        }

        return day % 7;
    }

    int convertMonthToDay(int month)
    {
        int result = 0;
        for(int index= 0; index< month-1; index++)
        {
            result += lastdays[index];
        }
        return result;
    }
}