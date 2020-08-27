package code.programers.level.one;

public class Calendar {

    int new_year = 5;

    int[] lastdays = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    int date(int month, int day)
    {
        if(month == 1 && day == 1)
        {
            return new_year;
        }

        return 1;
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