package code.programers.level.one;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
        int n = 3;
        int[] lost = {3};
        int[] reserve = {1};

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

        assertEquals(2, n);
    }
}