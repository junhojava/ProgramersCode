package code.programers.level.one;

public class Calendar {

    int new_year = 5;

    
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
        return 120;
    }
}