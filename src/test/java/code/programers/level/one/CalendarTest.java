package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalendarTest {

    /**
     * 2016-01-01 = FRI
     * [SUN, MON, TUE, WED, THU, FRI, SAT]
     *   0    1    2    3    4    5    6
     * 2016-05-24 = TUE
     * 
     * 1year = 365 day
     * 
     * 365 / 12 = 30
     * 365 % 12 = 5
     * 
     * 달마다 각 30일씩을 부여 받을 수 있다.
     * 달마다 마지막날의 범위는 28 ~ 31 이다.
     * 나머지 값 5 = (5)
     * 윤년일 경우에는 366일이 되기 떄문에 1일이 추가 나머지는 6으로 증가
     * 현재 상황 = 나머지는 6
     * 1 = 31(+1)
     * 2 = 29(-1)
     * 3 = 31(+1)
     * 4 = 30
     * 5 = 31(+1)
     * 6 = 30
     * 7 = 31(+1)
     * 8 = 31(+1)
     * 9 = 30
     * 10 = 31(+1)
     * 11 = 30
     * 12 = 31(+1)
     * 이렇게 놓고 계산 했을 때
     * 1월 1일에서 5월 24일 까지는 144일 경과했다.
     * 20주하고 4일 지났다.
     * (30 + 29 + 31 + 30 + 24 = 144)
     * 144 % 7 = 4
     * 5 + 4 = 9
     * 9 % 7 = 2
     * 
     * 2월 1일이면 31 % 7 = 2 SUN
     */
    Calendar calendar = new Calendar();

    @Test
    void testNewYear()
    {
        int day= calendar.date(1, 1);

        assertEquals(5, day);
    }

    @Test
    void testMonthConvertDay()
    {
        int one = calendar.convertMonthToDay(1);
        int two = calendar.convertMonthToDay(2);
        int five = calendar.convertMonthToDay(5);

        assertEquals(0, one);
        assertEquals(31, two);
        assertEquals(121, five);
    }
    
    @Test
    void testCaseOne()
    {
        int day= calendar.date(5, 24);

        assertEquals(2, day);
    }

    @Test
    void testCaseOneString()
    {
        int day = calendar.date(5, 24);
        

        assertEquals("TUE", calendar.dayConvertString(day));
    }
}