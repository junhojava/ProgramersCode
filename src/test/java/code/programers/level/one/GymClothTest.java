package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class GymClothTest {
    
    GymCloth gc = new GymCloth();

    @Test
    void testIsSelf()
    {
        assertEquals(1, gc.who(new int[]{2,3,4}, 3));
    }

    @Test
    void testWho()
    {
        assertArrayEquals(new int[] {2,4}, gc.canRent(3));
    }

    @Test
    void testCaseOne()
    {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {1,3,5};

        for(int me:reserve)
            if(gc.who(lost, me) > -1)
                lost[gc.who(lost, me)] = -1;
            else
                for(int number:gc.canRent(me))
                    if(gc.who(lost, number) > -1)
                    {
                        lost[gc.who(lost, number)] = -1;
                        break;
                    }

        n -= (lost.length - gc.count(lost));

        assertEquals(5, n);
    }

    @Test
    void testCaseTwo()
    {
        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {3};

        for(int me:reserve)
            if(gc.who(lost, me) > -1)
                lost[gc.who(lost, me)] = -1;
            else
                for(int number:gc.canRent(me))
                    if(gc.who(lost, number) > -1)
                    {
                        lost[gc.who(lost, number)] = -1;
                        break;
                    }

        n -= (lost.length - gc.count(lost));

        assertEquals(4, n);
    }

    @Test
    void testCaseThree()
    {
        int n = 5;
        int[] lost = {2,3,4};
        int[] reserve = {1,3,5};
        int rc = 0;
        int lc = 0;

        Arrays.sort(lost);
        Arrays.sort(reserve);

        for(int index=0; index< reserve.length; index++)
            if(gc.who(lost,reserve[index]) > -1)
            {
                lost[gc.who(lost,reserve[index])] = 32;
                reserve[index] = 32;
                lc++;
                rc++;
            }

        Arrays.sort(lost);
        Arrays.sort(reserve);

        lost = Arrays.copyOf(lost, lost.length-lc);
        reserve = Arrays.copyOf(reserve, reserve.length-rc);

        lc = 0;
        rc = 0;

        for(int index=0; index< reserve.length; index++)
            for(int number:gc.canRent(reserve[index]))
                    if(gc.who(lost, number) > -1)
                    {
                        lost[gc.who(lost, number)] = 32;
                        reserve[index] = 32;
                        lc++;
                        rc++;
                        break;
                    }

        Arrays.sort(lost);
        Arrays.sort(reserve);

        lost = Arrays.copyOf(lost, lost.length-lc);
        reserve = Arrays.copyOf(reserve, reserve.length-rc);

        n -= lost.length;

        assertEquals(5, n);
    }
}