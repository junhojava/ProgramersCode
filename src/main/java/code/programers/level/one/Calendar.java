package code.programers.level.one;

public class Calendar {

    int newYear;

    int[] lastDays;

    String[] dayStr;

    public Calendar (int newYear)
    {
        this.newYear = newYear;
        this.lastDays = new int[]{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        this.dayStr = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
    }

    String whatDay(int day)
    {
        return dayStr[day];
    }

    int dayIndex(int month, int day)
    {
        if(month == 1 && day == 1)
            return newYear;
        else
            return (day + addedDate(month) + newYear - 1) % 7;
    }

    int addedDate(int month)
    {
        int result = 0;

        for(int index= 0; index< month-1; index++)
            result += lastDays[index];

        return result;
    }
}